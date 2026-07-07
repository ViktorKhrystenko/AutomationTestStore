# Login Test Suite

**Description:** Test suite verifies correctness of login process, edge cases of password validation and logged out users' handling.

## Common Preconditions

If not specified contrary to these items, such preconditions are common for each test case in this suite:
1. You are logged out;
2. You are on login page (/index.php?rt=account/login);
3. You have preregistered account.

## Test Cases

[Traceability Matrix](./login-traceability-matrix.md)

### General test cases

#### Positive

| ID        | Title                                                                                       | Level | Priority  |
|-----------|---------------------------------------------------------------------------------------------|-------|-----------|
| TC-LOG-01 | [Existing login with correct password](./TC-LOG-01_existing-login-with-correct-password.md) | Smoke | Very high |

#### Negative

| ID        | Title                                                                         | Level    | Priority |
|-----------|-------------------------------------------------------------------------------|----------|----------|
| TC-LOG-08 | [JS executable in login fields](./TC-LOG-08_js-executable-in-login-fields.md) | Extended | High     |

### "Login name" test cases

#### Positive

#### Negative

| ID        | Title                                                              | Level         | Priority |
|-----------|--------------------------------------------------------------------|---------------|----------|
| TC-LOG-02 | [Empty "Login Name"](./login-name/TC-LOG-02_empty_login-name.md)   | Critical path | High     |
| TC-LOG-03 | [Not existing login](./login-name/TC-LOG-03_not-existing-login.md) | Critical path | High     |

###  test cases

#### Positive

#### Negative

| ID        | Title                                                                                                          | Level         | Priority |
|-----------|----------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-LOG-04 | [Empty "Password"](./password/TC-LOG-04_empty-password.md)                                                     | Critical path | High     |
| TC-LOG-05 | [Incorrect password](./password/TC-LOG-05_incorrect-password.md)                                               | Critical path | High     |
| TC-LOG-06 | [Password case sensitivity](./password/TC-LOG-06_password-case-sensitivity.md)                                 | Critical path | High     |
| TC-LOG-07 | [Password with leading and trailing spaces](./password/TC-LOG-07_password-with-leading-and-trailing-spaces.md) | Critical path | High     |

###  test cases

#### Positive

#### Negative

| ID        | Title                                                                                                                           | Level         | Priority  |
|-----------|---------------------------------------------------------------------------------------------------------------------------------|---------------|-----------|
| TC-LOG-09 | [Using "Back" browser button after logout](./logged-in-logged-out-states/TC-LOG-09_using-back-browser-button-after-logout.md)   | Critical path | Very high |
| TC-LOG-10 | [Accessing account pages after logout](./logged-in-logged-out-states/TC-LOG-10_accessing-account-pages-after-logout.md)         | Critical path | Very high |
| TC-LOG-11 | [Accessing account pages being logged out](./logged-in-logged-out-states/TC-LOG-11_accessing-account-pages-being-logged-out.md) | Critical path | Very high |
