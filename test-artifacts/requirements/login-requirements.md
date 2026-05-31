# Login Requirements
[back to main requirements catalog](requirements.md)

## System Characteristics

SC-LOG-01: The system shall provide a secure, web-based graphical user interface for user authentication at the designated login endpoint (/index.php?rt=account/login).

SC-LOG-02: The system shall obfuscate specific authentication failures by returning generic error messages to prevent credential harvesting or account enumeration.

## User Requirements

UR-LOG-01: A registered user shall be able to access their personal account dashboard by providing their correct login credentials.

UR-LOG-02: A user shall receive immediate, clear, but generalized visual feedback if their login attempt is unsuccessful due to invalid or missing credentials.

## Business Rules

BR-LOG-01: User authentication requires an exact, simultaneous match of both an existing Login Name and its corresponding Password in the system database.

BR-LOG-02: Security through obscurity: The system must never disclose whether the Login Name or the Password was the cause of the authentication failure. Both missing and incorrect inputs must yield the exact same error response.

## Limitations

LM-LOG-01: The current login mechanism relies solely on a single-factor authentication (Login Name and Password).

## Detailed Specifications

### Successful Authentication (Positive Paths)

| Req ID       | Description                                                                                                                                                                                                                      | Priority |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-LOG-01.01 | Upon form submission with a valid, pre-registered Login Name and its correct corresponding Password, the system shall authenticate the session and redirect the user to their account dashboard (/index.php?rt=account/account). | Critical |

### Authentication Failures (Negative Paths)

| Req ID       | Field      | Description                                                                                                                                                                                 | Priority |
|--------------|------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-LOG-02.01 | Login Name | If the user submits the form with an empty "Login Name" field, the system shall deny authentication and trigger a generic error prompt.                                                     | High     |
| DS-LOG-02.02 | Login Name | If the user submits the form with a "Login Name" that does not exist in the database, the system shall deny authentication and trigger a generic error prompt.                              | High     |
| DS-LOG-02.03 | Password   | If the user submits the form with an empty "Password" field, the system shall deny authentication and trigger a generic error prompt.                                                       | High     |
| DS-LOG-02.04 | Password   | If the user submits the form with a "Password" that does not match the stored password for the given "Login Name", the system shall deny authentication and trigger a generic error prompt. | High     |

### Error Handling & Navigation State

| Req ID       | Description                                                                                                                                                                                         | Priority |
|--------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| DS-LOG-03.01 | In any failed authentication scenario (as defined in DS-LOG-02.01 through DS-LOG-02.04), the generic error prompt displayed to the user must strictly read: "Incorrect login or password provided." | High     |
| DS-LOG-03.02 | In any failed authentication scenario, the system shall not redirect the user; the user must remain on the login page (/index.php?rt=account/login).                                                | High     |
