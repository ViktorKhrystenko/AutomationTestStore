# Test Suite: Registration

[Back to test suites list](./../test-suites.md)

[Back to README](./../../../readme.md)

**Description:** Test suite verifies registration process, chacking edge cases for both necessary and optional fields.

## Common Preconditions

1. You are logged out;
2. You are on registration page (/index.php?rt=account/create).

## Test Cases

[Traceability Matrix](../../traceability-matrices/registration-traceability-matrix.md)

### General test cases

#### Positive

| ID        | Title                                                                                                                    | Level    | Priority  |
|-----------|--------------------------------------------------------------------------------------------------------------------------|----------|-----------|
| TC-REG-01 | [Successful registration, only necessary fields](./TC-REG-01_successful-registration-only-necessary-fields.md)           | Smoke    | Very high |
| TC-REG-02 | [Successful registration, all fields](./TC-REG-02_successful-registration-all-field.md)                                  | Smoke    | Medium    |

#### Negative

| ID        | Title                                                                                                                    | Level    | Priority       |
|-----------|--------------------------------------------------------------------------------------------------------------------------|----------|----------------|
| TC-REG-04 | [Registration by direct HTTP request, invalid values](./TC-REG-04_registration-by-direct-http-request-invalid-values.md) | Extended | High           |
| TC-REG-05 | [JS executable in registration fields](TC-REG-05_js-executable-in-registration-fields.md)                                | Extended | High           |

### "First Name" test cases

#### Positive

| ID        | Title                                                                       | Level         | Priority |
|-----------|-----------------------------------------------------------------------------|---------------|----------|
| TC-REG-07 | ["First Name", max length](./first-name/TC-REG-07_first-name-max-length.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                                         | Level         | Priority |
|-----------|---------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-06 | ["First Name", empty](./first-name/TC-REG-06_first-name-empty.md)                                             | Critical path | High     |
| TC-REG-08 | ["First Name", above upper boundary length](./first-name/TC-REG-08_first-name-above-upper-boundary-length.md) | Critical path | High     |
| TC-REG-09 | ["First Name", only space characters](./first-name/TC-REG-09_first-name-only-space-characters.md)             | Critical path | High     |
| TC-REG-10 | ["First Name", not allowed characters](./first-name/TC-REG-10_first-name-not-allowed-characters.md)           | Critical path | High     |

### "Last Name" test cases

#### Positive

| ID        | Title                                                                    | Level         | Priority |
|-----------|--------------------------------------------------------------------------|---------------|----------|
| TC-REG-12 | ["Last Name", max length](./last-name/TC-REG-12_last-name-max-length.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                                      | Level         | Priority |
|-----------|------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-11 | ["Last Name", empty](./last-name/TC-REG-11_last-name-empty.md)                                             | Critical path | High     |
| TC-REG-13 | ["Last Name", above upper boundary length](./last-name/TC-REG-13_last-name-above-upper-boundary-length.md) | Critical path | High     |
| TC-REG-14 | ["Last Name", only space characters](./last-name/TC-REG-14_last-name-only-space-characters.md)             | Critical path | High     |
| TC-REG-15 | ["Last Name", not allowed characters](./last-name/TC-REG-15_last-name-not-allowed-characters.md)           | Critical path | High     |

### "Email" test cases

#### Positive

| ID        | Title                                                                                   | Level    | Priority |
|-----------|-----------------------------------------------------------------------------------------|----------|----------|
| TC-REG-17 | [Non-standard email registration](./email/TC-REG-17_non-standard-email-registration.md) | Extended | High     |

#### Negative

| ID        | Title                                                                                           | Level         | Priority |
|-----------|-------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-16 | ["E-Mail", empty](./email/TC-REG-16_email-empty.md)                                             | Critical path | High     |
| TC-REG-18 | [Invalid email](./email/TC-REG-18_invalid-email.md)                                             | Critical path | High     |
| TC-REG-19 | [Register with already used email](./email/TC-REG-19_register-with-already-used-email.md)       | Critical path | High     |
| TC-REG-20 | [Email from temporary email services](./email/TC-REG-20_email-from-temporary-email-services.md) | Extended      | High     |

### "Telephone" test cases

#### Positive

| ID        | Title                                                                    | Level         | Priority |
|-----------|--------------------------------------------------------------------------|---------------|----------|
| TC-REG-22 | ["Telephone", min length](./telephone/TC-REG-22_telephone-min-length.md) | Critical path | Medium   |
| TC-REG-23 | ["Telephone", max length](./telephone/TC-REG-23_telephone-max-length.md) | Critical path | Medium   |

#### Negative

| ID        | Title                                                                                                   | Level         | Priority |
|-----------|---------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-21 | ["Telephone", below lower bound length](./telephone/TC-REG-21_telephone-below-lower-bound-length.md)    | Critical path | Medium   |
| TC-REG-24 | ["Telephone", above upper bound length](./telephone/TC-REG-24_telephone-above-upper-bound-length.md)    | Critical path | Medium   |
| TC-REG-25 | ["Telephone", not leading "+"](./telephone/TC-REG-25_telephone-not-leading-plus.md)                     | Critical path | Medium   |
| TC-REG-26 | ["Telephone" without country code](./telephone/TC-REG-26_telephone-without-country-code.md)             | Critical path | Medium   |
| TC-REG-27 | ["Telephone" with non-numeric characters](telephone/TC-REG-27_telephone-with-non-numeric-characters.md) | Critical path | Medium   |
| TC-REG-28 | [Register with already used telephone](./telephone/TC-REG-28_register-with-already-used-telephone.md)   | Critical path | High     |

### "Address 1" test cases

#### Positive

| ID        | Title                                                                    | Level         | Priority |
|-----------|--------------------------------------------------------------------------|---------------|----------|
| TC-REG-31 | ["Address 1", min length](./address-1/TC-REG-31_address-1-min-length.md) | Critical path | High     |
| TC-REG-32 | ["Address 1", max length](./address-1/TC-REG-32_address-1-max-length.md) | Critical path | Medium   |

#### Negative

| ID        | Title                                                                                                | Level         | Priority |
|-----------|------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-29 | ["Address 1", empty](./address-1/TC-REG-29_address-1-empty.md)                                       | Critical path | High     |
| TC-REG-30 | ["Address 1", below lower bound length](./address-1/TC-REG-30_address-1-below-lower-bound-length.md) | Critical path | High     |
| TC-REG-33 | ["Address 1", above upper bound length](./address-1/TC-REG-33_address-1-above-upper-bound-length.md) | Critical path | High     |

### "Address 2" test cases

#### Positive

| ID        | Title                                                                    | Level         | Priority |
|-----------|--------------------------------------------------------------------------|---------------|----------|
| TC-REG-35 | ["Address 2", min length](./address-2/TC-REG-35_address-2-min-length.md) | Critical path | High     |
| TC-REG-36 | ["Address 2", max length](./address-2/TC-REG-36_address-2-max-length.md) | Critical path | Low      |

#### Negative

| ID        | Title                                                                                                | Level         | Priority |
|-----------|------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-34 | ["Address 2", below lower bound length](./address-2/TC-REG-34_address-2-below-lower-bound-length.md) | Critical path | Low      |
| TC-REG-37 | ["Address 2", above upper bound length](./address-2/TC-REG-37_address-2-above-upper-bound-length.md) | Critical path | Low      |
| TC-REG-38 | [Both addresses are equal](./address-2/TC-REG-38_both-addresses-are-equal.md)                        | Extended      | Low      |

### "City" test cases

#### Positive

| ID        | Title                                                     | Level         | Priority |
|-----------|-----------------------------------------------------------|---------------|----------|
| TC-REG-41 | ["City", min length](./city/TC-REG-41_city-min-length.md) | Critical path | High     |
| TC-REG-42 | ["City", max length](./city/TC-REG-42_city-max-length.md) | Critical path | Medium   |

#### Negative

| ID        | Title                                                                                 | Level         | Priority |
|-----------|---------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-39 | ["City", empty](./city/TC-REG-39_city-empty.md)                                       | Critical path | High     |
| TC-REG-40 | ["City", below lower bound length](./city/TC-REG-40_city-below-lower-bound-length.md) | Critical path | High     |
| TC-REG-43 | ["City", above upper bound length](./city/TC-REG-43_city-above-upper-bound-length.md) | Critical path | Medium   |
| TC-REG-44 | ["City", not allowed characters](./city/TC-REG-44_city-not-allowed-characters.md)     | Critical path | High     |

### "ZIP Code" test cases

#### Positive

| ID        | Title                                                                 | Level         | Priority |
|-----------|-----------------------------------------------------------------------|---------------|----------|
| TC-REG-47 | ["ZIP Code", min length](./zip-code/TC-REG-47_zip-code-min-length.md) | Critical path | High     |
| TC-REG-48 | ["ZIP Code", max length](./zip-code/TC-REG-48_zip-code-max-length.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                             | Level         | Priority |
|-----------|---------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-45 | ["ZIP Code", empty](./zip-code/TC-REG-45_zip-code-empty.md)                                       | Critical path | High     |
| TC-REG-46 | ["ZIP Code", below lower bound length](./zip-code/TC-REG-46_zip-code-below-lower-bound-length.md) | Critical path | High     |
| TC-REG-49 | ["ZIP Code", above upper bound length](./zip-code/TC-REG-49_zip-code-above-upper-bound-length.md) | Critical path | High     |
| TC-REG-50 | ["ZIP Code", not allowed characters](./zip-code/TC-REG-50_zip-code-not-allowed-characters.md)     | Critical path | High     |

### "Country" test cases

#### Positive

#### Negative

| ID        | Title                                                                                           | Level         | Priority |
|-----------|-------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-51 | [Registration with default "Country"](./country/TC-REG-51_registration-with-default-country.md) | Critical path | High     |

### "Region / State" test cases

#### Positive

| ID        | Title                                                                                                                                        | Level         | Priority |
|-----------|----------------------------------------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-03 | [Registration "Country" brings "Region / State" to default](./region-state/TC-REG-03_registration-country-brings-region_state-to-default.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                                            | Level         | Priority |
|-----------|------------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-52 | [Registration with default "Region / State"](./region-state/TC-REG-52_registration-with-default-region-state.md) | Critical path | High     |

### "Login name" test cases

#### Positive

| ID        | Title                                                                       | Level         | Priority |
|-----------|-----------------------------------------------------------------------------|---------------|----------|
| TC-REG-55 | ["Login name", min length](./login-name/TC-REG-55_login-name-min-length.md) | Critical path | High     |
| TC-REG-56 | ["Login name", max length](./login-name/TC-REG-56_login-name-max-length.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                                                  | Level         | Priority |
|-----------|------------------------------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-53 | ["Login name", empty](./login-name/TC-REG-53_login-name-empty.md)                                                      | Critical path | High     |
| TC-REG-54 | ["Login name", below lower bound length](./login-name/TC-REG-54_login-name-below-lower-bound-length.md)                | Critical path | High     |
| TC-REG-57 | ["Login name", above upper bound length](./login-name/TC-REG-57_login-name-above-upper-bound-length.md)                | Critical path | High     |
| TC-REG-58 | ["Login name" with non-alphanumeric characters](./login-name/TC-REG-58_login-name-with-non-alphanumeric-characters.md) | Critical path | High     |
| TC-REG-59 | [Register with already used login name](./login-name/TC-REG-59_register-with-already-used-login-name.md)               | Critical path | High     |

### "Password" and "Password Confirm" test cases

#### Positive

| ID        | Title                                                                 | Level         | Priority |
|-----------|-----------------------------------------------------------------------|---------------|----------|
| TC-REG-62 | ["Password", min length](./password/TC-REG-62_password-min-length.md) | Critical path | High     |
| TC-REG-63 | ["Password", max length](./password/TC-REG-63_password-max-length.md) | Critical path | High     |

#### Negative

| ID        | Title                                                                                             | Level         | Priority |
|-----------|---------------------------------------------------------------------------------------------------|---------------|----------|
| TC-REG-60 | ["Password", empty](./password/TC-REG-60_password-empty.md)                                       | Critical path | High     |
| TC-REG-61 | ["Password", below lower bound length](./password/TC-REG-61_password-below-lower-bound-length.md) | Critical path | High     |
| TC-REG-64 | ["Password", above upper bound length](./password/TC-REG-64_password-above-upper-bound-length.md) | Critical path | High     |

### "Privacy Policy" test cases

#### Positive

#### Negative

| ID        | Title                                                                                    | Level         | Priority  |
|-----------|------------------------------------------------------------------------------------------|---------------|-----------|
| TC-REG-65 | [Not checked "Privacy Policy"](./privacy-policy/TC-REG-65_not-checked-privacy-policy.md) | Critical path | Very high |
