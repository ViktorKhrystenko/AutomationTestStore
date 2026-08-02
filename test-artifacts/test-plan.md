# Automation Test Store Test Plan

[Back to README](./../readme.md)

## Project scope and main goals

Dummy web store, that simulate behavior and functions of real web store, like registration, adding product to cart, checkout, etc. Created for testers' practice and training purposes.

## To be tested

- [Registration](./requirements/registration-requirements.md);
- [Login](./requirements/login-requirements.md);
- [Checkout process](./requirements/checkout-requirements.md).

## NOT to be tested

- Payment (this is dummy store, it does not have payment system);
- Password recovery;
- Account info change.

## Test strategy and approach

### General approach

Since this is public dummy web store, there is no access to API, database, and source code in general, so testing efforts will be concentrated on UI testing.

### Functional testing levels

- Smoke tests: automated with TA framework;
- Critical path tests: automated with TA framework;
- Extended/regression tests: automated with TA framework;

Tests, that have failed during automation testing, have to be executed once more manually to confirm defect and make more screenshots for bug report attachments in addition to screenshots from Allure reports.

## Criteria

### Entry criteria

New build.

### Exit criteria

Refer to [Acceptance criteria](#acceptance-criteria).

### Acceptance criteria

All listed below must be fulfilled:
1. 100% [success rate](#test-cases-success-rate) of Smoke test cases;
2. 90% [success rate](#test-cases-success-rate) of Critical path test cases;
3. 100% of Very High severity bugs are fixed;
4. 80% [coverage of the requirement](#requirements-coverage-percentage) is scored;

### Suspension criteria

For critical path tests:
- 100% of smoke tests are executed.

For all test activities one of the followings:
- 100% of smoke tests are executed and [success rate](#test-cases-success-rate) is less than 100%;
- at least 30% of tests are executed and [success rate](#test-cases-success-rate) is less than 50%.

### Resumption criteria

All listed below must be fulfilled:
1. 100% of bugs, found on smoke test cases, are fixed;
2. 50% of all found before suspension bugs are fixed.

## Resources

### Software:

- Firefox browser. Version: latest;
- TA framework (Java 21, Selenium, TestNG, Allure Reports).

### Hardware:

- one laptop (16GB RAM, Ryzen 5 3.3 GHz).

### Personnel:

- one tester. Role: tester.

### Time:

- 2 weeks.

## Schedule

- 01.06: final requirements refining;
- 02.06 - 05.06: test cases creation;
- 08.06 - 11.06: main testing activity (test cases execution, bug reporting);
- 12.06: test results reporting.

## Roles and responsibilities

- tester: documentation creation, test cases execution, bug reporting.

## Risk evaluation

### Time

Low probability: since its dummy site for training purposes, there are no real time constrains. Nevertheless, [schedule](#schedule) remains valid and can be broke only in case other risks come true.

### Personnel

Low probability: if any participant is inaccessible (due to illness, etc.), testing activities can be postponed till time all team members are accessible again, since [time](#time) is not a constraint.

## Documentation

- Requirements: refined by tester;
- Test cases: created by tester;
- Bug reports: created by tester;
- Test report: created by tester.

Creation periods for all these documents can be found in [schedule](#schedule).

## Metrics

### Test cases' success rate

$$ T^{SP} = \frac{T^{Success}}{T^{Total}} * 100\% $$

$`T^{SP}`$ - percentage of successfully passed test cases;

$`T^{Success}`$ - quantity of successfully passed test cases;

$`T^{Total}`$ - total quantity o executed test cases.

### Defects fixed percentage

$$ D_{Level}^{FTP} = \frac{D_{Level}^{Closed}}{D_{Level}^{Found}} * 100\% $$

$`D_{Level}^{FTP}`$ - percentage of fixed defects(bugs) by `Level`;

$`D_{Level}^{Closed}`$ - quantity of fixed defects of certain `Level`;

$`D_{Level}^{Found}`$ - quantity of found defects of certain `Level`.

#### Minimal accepted defects fixed percentage

| Defect severity | Minimal accepted defects fixed percentage |
|-----------------|:-----------------------------------------:|
| Very High       |                   100%                    |
| High            |                   100%                    |
| Medium          |                    60%                    |
| Low             |                    20%                    |

### Test cases execution percentage

$$ T^E = \frac{T^{Executed}}{T^{Total}} * 100\% $$

$`T^E`$ - percentage of executed test cases;

$`T^{Executed}`$ - quantity of executed test cases;

$`T^{Total}`$ - quantity of test cases, planned to execution.

### Requirements coverage percentage

$$ R^C = \frac{R^{Covered}}{R^{Total}} * 100\% $$

$`R^C`$ - percentage of requirements, covered by at least one test case;

$`R^{Covered}`$ - quantity of requirements, covered by at least one test case;

$`R^{Total}`$ - total quantity of requirements.
