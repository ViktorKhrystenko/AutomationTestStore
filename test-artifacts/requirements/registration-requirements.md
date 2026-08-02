# Registration Requirements 
[back to main requirements catalog](requirements.md)

## System Characteristics

SC-REG-01: The system shall provide a responsive web-based graphical user interface accessible via standard modern web browsers.

SC-REG-02: The application shall process form submissions synchronously, returning field-specific validation errors directly to the user interface upon failure.

SC-REG-03: The backend system shall independently validate all incoming request payloads. The server must rigorously enforce all data constraints (format, length, mandatory fields, and business rules) and reject invalid requests, completely independent of any client-side (frontend) validation mechanisms.

SC-REG-04: Upon receiving an invalid form submission, the server shall not create a database record. Instead, it must respond with an HTTP "200 OK" status, returning the full HTML of the registration page with the appropriate field-specific error messages embedded within the document structure.

## User Requirements

UR-REG-01: A guest user shall be able to navigate to the registration form from the main login portal to create a new customer account.

UR-REG-02: A user shall receive immediate, localized feedback if the entered data violates any validation rules.

## Business Rules

BR-REG-01: An individual customer account must be strictly and uniquely identified by a single E-mail address: duplicate registrations using the same email address are prohibited.

BR-REG-02: A customer must be uniquely identified in the system by an alphanumeric Login name.

BR-REG-03: If a user opts to provide a Telephone number, it must be unique across all existing accounts.

BR-REG-04: Account creation is strictly gated by legal consent: the system shall not create an account unless the user has explicitly accepted the Privacy Policy.

BR-REG-05: Subscription to marketing newsletters must be entirely optional and explicitly opt-in. The system is prohibited from automatically subscribing users to promotional campaigns without their direct consent.

BR-REG-06: The system is prohibited from saving identical strings for both address fields within a single account profile: the primary and secondary address lines must contain unique values.

## Limitations

LM-REG-01: The geographical inputs (Country and Region/State) are restricted to predefined datasets managed by the application: users cannot manually input unlisted territories.

LM-REG-02: Telephone numbers are restricted strictly to numeric digits, limiting native support for complex international formats that require alphabetical extensions.

## Detailed Specifications

### DS-REG-01: First Name

DS-REG-01.01: The field must not be empty.

DS-REG-01.02: The field must accept exactly 1 to 32 characters.

DS-REG-01.03: The field shall only accept alphabetic characters (a-z, A-Z), cyrillic characters (а-я, А-Я, і, І, ї, Ї, є, Є, ґ, Ґ, ъ, Ъ, ы, Ы, э, Э), spaces, hyphens (-), and apostrophes (').
- DS-REG-01.03.01: The field must not consist solely of space characters.

### DS-REG-02: Last Name

Detailed specifications for "Last Name" field are equal to detailed specifications for "First Name" field. Refer to [DS-REG-01: First Name](#ds-reg-01-first-name)

### DS-REG-03: E-mail

DS-REG-03.01: The field must not be empty and must validate against standard email format definitions.

DS-REG-03.02: The system must reject the registration and display an error "E-Mail Address is already registered!" if the provided email address is already associated with an existing account.

### DS-REG-04: Telephone

DS-REG-04.01: This field is optional. If populated, it must contain exactly 7 to 15 numeric digits. 

DS-REG-04.02: The only one non-numeric symbol allowed is leading "+".

DS-REG-04.03: The system must reject the registration and display an error "Telephone is already registered!" if the provided telephone number is already associated with an existing account.

### DS-REG-05: Fax

DS-REG-05.01: This field is optional and accepts standard numeric input.

### DS-REG-06: Company

DS-REG-06.01: This field is optional and accepts input of alphanumeric and special characters and numbers.

### DS-REG-07: Address 1

DS-REG-07.01: The field must not be empty.

DS-REG-07.02: The field must accept exactly 3 to 128 characters.

### DS-REG-08: Address 2

DS-REG-08.01: This field is optional and its length is equal to "Address 1" field length (refer to [DS-REG-07.02](#ds-reg-07-address-1)).

DS-REG-08.02: If populated, the value in this field must not be identical to the value provided in "Address 1". The system shall reject the registration and display a validation error if both fields contain duplicate values.

### DS-REG-09: City

DS-REG-09.01: The field must not be empty.

DS-REG-09.02: The field must accept exactly 3 to 128 characters.

DS-REG-09.03: The field shall only accept alphabetic characters, spaces, hyphens (-), apostrophes ('), and periods (.).

### DS-REG-10: ZIP Code

DS-REG-10.01: The field must not be empty.

DS-REG-10.02: The field must accept exactly 3 to 10 characters.

DS-REG-10.03: The field shall only accept alphanumeric characters, spaces, and hyphens (-).

### DS-REG-11: Country

DS-REG-11.01: The user must select a valid option from the dropdown menu.

DS-REG-11.02: The default state of dropdown menu is " --- Please Select --- ", and it is invalid for submission.

### DS-REG-12: Region / State

DS-REG-12.01: The user must select a valid option from the dynamically populated dropdown menu. Options are populated depending on selected "Country" dropdown option.

DS-REG-12.02: Default state and its properties are equal to default state and properties of "Country" dropdown menu (refer to [DS-REG-11.02](#ds-reg-11-country))

DS-REG-12.03: Changing the selected option in the "Country" dropdown shall immediately reset the "Region / State" dropdown to its default state.

### DS-REG-13: Login name

DS-REG-13.01: The field must not be empty.

DS-REG-13.02: The field must accept exactly 5 to 64 alphanumeric characters.

DS-REG-13.03: The system must reject the registration and display an error "This login name is not available. Try different login name!" if the provided login name is already associated with an existing account.

### DS-REG-14: Password

DS-REG-14.01: The field must not be empty.

DS-REG-14.02: The field must accept exactly 4 to 20 characters.

### DS-REG-15: Password Confirm

DS-REG-15.01: The field must not be empty.

DS-REG-15.02: The string value of this field must be strictly identical to the string value provided in the "Password" field.

### DS-REG-16: Newsletter

DS-REG-16.01: TThe field must be presented as a mutually exclusive radio button group with two options: "Yes" and "No".

DS-REG-16.02: The "No" radio button must be selected by default upon initial page load.

DS-REG-16.03: The field is mandatory in the UI context (one option must always be selected).
- DS-REG-16.03.01: Selecting "No" shall not impede the registration process.

### DS-REG-17: Privacy Policy

DS-REG-17.01: The "Privacy Policy" checkbox must be explicitly checked by the user prior to submitting the registration form.

### DS-REG-18: Continue button

DS-REG-18.01: Click on the button must submit registration form.
- DS-REG-18.01.01: If all the requirements listed below are fulfilled, then account must be created and the application redirects to successful registration page (/index.php?rt=account/success):
  - If all of necessary fields are not empty;
  - If all non-empty fields are filled with valid values (see [DS-REG-01](#ds-reg-01-first-name)-[DS-REG-15](#ds-reg-15-password-confirm));
  - If the values for "Country" and "Region / State" dropdowns are selected and they are not equal to default (see [DS-REG-11.02](#ds-reg-11-country));
  - If "Privacy Policy" checkbox is checked.
- DS-REG-18.01.02: If at least one of those requirements are not fulfilled, then account is not created, the app stays on registration page and displays errors, explaining what prevented from creating account.

DS-REG-18.02: When clicked, button has to become unavailable and be replaced with loading animation.
