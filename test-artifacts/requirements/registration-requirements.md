# Registration Requirements 
[back to main requirements catalog](requirements.md)

## System Characteristics

SC-REG-01: The system shall provide a responsive web-based graphical user interface accessible via standard modern web browsers.

SC-REG-02: The application shall process form submissions synchronously, returning field-specific validation errors directly to the user interface upon failure.

## User Requirements

UR-REG-01: A guest user shall be able to navigate to the registration form from the main login portal to create a new customer account.

UR-REG-02: A user shall receive immediate, localized feedback if the entered data violates any validation rules.

## Business Rules

BR-REG-01: An individual customer account must be strictly and uniquely identified by a single E-mail address: duplicate registrations using the same email address are prohibited.

BR-REG-02: A customer must be uniquely identified in the system by an alphanumeric Login name.

BR-REG-03: If a user opts to provide a Telephone number, it must be unique across all existing accounts.

BR-REG-04: Account creation is strictly gated by legal consent: the system shall not create an account unless the user has explicitly accepted the Privacy Policy.

## Limitations

LM-REG-01: The geographical inputs (Country and Region/State) are restricted to predefined datasets managed by the application: users cannot manually input unlisted territories.

LM-REG-02: Telephone numbers are restricted strictly to numeric digits, limiting native support for complex international formats that require alphabetical extensions.

## Detailed Specifications

### Personal Details Validation

| Req ID   | Field      | Description                                                                                                                                                                                                                                     | Priority |
|----------|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-REG-01.01 | First Name | The field must accept exactly 1 to 32 characters. It must not be empty or consist solely of space characters.                                                                                                                                   | High     |
| DS-REG-01.02 | First Name | The field shall only accept alphabetic characters (a-z, A-Z), cyrillic characters (а-я, А-Я, і, І, ї, Ї, є, Є, ґ, Ґ, ъ, Ъ, ы, Ы, э, Э), spaces, hyphens (-), and apostrophes ('). Numeric and other special characters are strictly prohibited. | High     |
| DS-REG-01.03 | Last Name  | The field must accept exactly 1 to 32 characters. It must not be empty or consist solely of space characters.                                                                                                                                   | High     |
| DS-REG-01.04 | Last Name  | The field shall only accept alphabetic characters (a-z, A-Z), cyrillic characters (а-я, А-Я, і, І, ї, Ї, є, Є, ґ, Ґ, ъ, Ъ, ы, Ы, э, Э), spaces, hyphens (-), and apostrophes ('). Numeric and other special characters are strictly prohibited. | High     |
| DS-REG-01.05 | E-mail     | The field must not be empty and must validate against standard email format definitions.                                                                                                                                                        | High     |
| DS-REG-01.06 | E-mail     | The system must reject the registration and display an error if the provided email address is already associated with an existing account.                                                                                                      | High     |
| DS-REG-01.07 | Telephone  | This field is optional. If populated, it must contain exactly 7 to 15 numeric digits. Alphabetic and special characters (with the exception of a leading +) are prohibited.                                                                     | Medium   |
| DS-REG-01.08 | Telephone  | The system must reject the registration if the provided telephone number is already associated with an existing account.                                                                                                                        | Medium   |
| DS-REG-01.09 | Fax        | This field is optional and accepts standard numeric input.                                                                                                                                                                                      | Low      |

### Address Details Validation

| Req ID       | Field                    | Description                                                                                                                                                           | Priority |
|--------------|--------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-REG-02.01 | Company                  | This field is optional and accepts input of alphanumeric and special characters and numbers.                                                                          | Low      |
| DS-REG-02.02 | Address 1                | The field must accept exactly 3 to 128 characters and must not be empty.                                                                                              | High     |
| DS-REG-02.03 | Address 2                | This field is optional. If populated, it must accept exactly 3 to 128 characters.                                                                                     | Low      |
| DS-REG-02.04 | City                     | The field must accept exactly 3 to 128 characters and must not be empty.                                                                                              | High     |
| DS-REG-02.05 | City                     | The field shall only accept alphabetic characters, spaces, hyphens (-), apostrophes ('), and periods (.). Numeric values and other special characters are prohibited. | High     |
| DS-REG-02.06 | ZIP Code                 | The field must accept exactly 3 to 10 characters and must not be empty.                                                                                               | High     |
| DS-REG-02.07 | ZIP Code                 | The field shall only accept alphanumeric characters, spaces, and hyphens (-). Other special characters are prohibited.                                                | High     |
| DS-REG-02.08 | Country                  | The user must select a valid option from the dropdown menu. The default " --- Please Select --- " state is invalid for submission.                                    | High     |
| DS-REG-02.09 | Country - Region / State | Changing the selected option in the "Country" dropdown shall immediately reset the "Region / State" dropdown to its default " --- Please Select --- " state.          | High     |
| DS-REG-02.10 | Region / State           | The user must select a valid option from the dynamically populated dropdown menu. The default " --- Please Select --- " state is invalid for submission.              | High     |

### Login Details Validation

| Req ID       | Field            | Description                                                                                                                       | Priority |
|--------------|------------------|-----------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-REG-03.01 | Login name       | The field must accept exactly 5 to 64 alphanumeric characters and must not be empty.                                              | High     |
| DS-REG-03.02 | Login name       | The field shall not accept spaces or special characters.                                                                          | High     |
| DS-REG-03.03 | Login name       | The system must reject the registration if the provided login name is already associated with an existing account.                | High     |
| DS-REG-03.04 | Password         | The field must accept exactly 4 to 20 characters and must not be empty.                                                           | High     |
| DS-REG-03.05 | Password Confirm | The field must not be empty and its string value must be strictly identical to the string value provided in the "Password" field. | High     |

### Legal & Compliance

| Req ID       | Field          | Description                                                                                                     | Priority |
|--------------|----------------|-----------------------------------------------------------------------------------------------------------------|----------|
| DS-REG-04.01 | Privacy Policy | The "Privacy Policy" checkbox must be explicitly checked by the user prior to submitting the registration form. | Critical |
