def BROWSER_LIST = ['chrome', 'firefox', 'edge']

pipeline {
    agent none

    stages {

        stage('Test') {
            matrix {
                axes {
                    axis {
                        name 'BROWSER'
                        values 'chrome', 'firefox', 'edge'
                    }
                }
                agent {
                    label "docker-${BROWSER}"
                }
                stages {
                    stage('Smoke') {
                        steps {
                            sh "mvn test -Drun.target=\"jenkins-docker-agent\" -Dgroups=\"smoke\" -Dbrowser=\"${BROWSER}\""
                        }
                    }
                    stage('Critical path') {
                        steps {
                            sh script: "mvn test -Drun.target=\"jenkins-docker-agent\" -Dgroups=\"critical-path\" -Dbrowser=\"${BROWSER}\" -Dmaven.test.failure.ignore=true", returnStatus: true
                        }
                    }
                    stage('Regression') {
                        steps {
                            sh script: "mvn test -Drun.target=\"jenkins-docker-agent\" -Dgroups=\"regression\" -Dbrowser=\"${BROWSER}\" -Dmaven.test.failure.ignore=true", returnStatus: true
                        }
                    }
                }

                post {
                    always {
                        sh "tar -czf allure-results-${BROWSER}.tar.gz -C target allure-results"

                        stash name: "allure-results-${BROWSER}", includes: "allure-results-${BROWSER}.tar.gz", allowEmpty: true
                    }
                }
            }
        }
    }

    post {
        always {
            node('built-in') {
                sh 'rm -rf target/allure-results && mkdir -p target'

                script {
                    for (String browserName: BROWSER_LIST) {
                        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                            unstash "allure-results-${browserName}"

                            sh "tar -xzf allure-results-${browserName}.tar.gz -C target"
                        }
                    }
                }
                allure jdk: '', results: [[path: 'target/allure-results']]
            }
        }
    }
}