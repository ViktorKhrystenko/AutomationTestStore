# 2. Login tests

## 2.1. Positive tests

### 2.1.1. General tests

#### 2.1.1.1. Test case - Check successful registration

Priority:

Status:

Preconditions:
- the user is on https://automationteststore.com/index.php?rt=account/login ;
- there is a registered user account with login name = bob12, and password = bob12.

| **Step**                                   | **Test data**     | **Expected result**                                                                             | **Actual result** |
|--------------------------------------------|-------------------|-------------------------------------------------------------------------------------------------|-------------------|
| 1. Enter login name in "Login Name" field. | Login name: bob12 | Entered login name must be visible inside "Login Name" field.                                   |                   |
| 2. Enter password into "Password" field.   | Password: bob12   | Entered password must be visible inside "Password" field.                                       |                   |
| 3. Push "Login" button.                    |                   | Successful login. The user is on https://automationteststore.com/index.php?rt=account/account . |                   |

## 2.2. Negative tests

### 2.2.1. "Login Name" tests

#### 2.2.1.1. Test case - Empty "Login Name" field

Priority:

Status:

Preconditions:
- the user is on https://automationteststore.com/index.php?rt=account/login ;
- there is a registered user account with login name = bob12, and password = bob12.

| **Step**                                 | **Test data**     | **Expected result**                                                                                                                                    | **Actual result** |
|------------------------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------|
| 1. Enter password into "Password" field. | Password: bob12   | Entered password must be visible inside "Password" field.                                                                                              |                   |
| 2. Push "Login" button.                  |                   | Login failed, the user is still on https://automationteststore.com/index.php?rt=account/login .The "incorrect login or password" prompt has to appear. |                   |

#### 2.2.1.2. Test case - Incorrect login name

Priority:

Status:

Preconditions:
- the user is on https://automationteststore.com/index.php?rt=account/login ;
- there is a registered user account with login name = bob12, and password = bob12.

| **Step**                                                                                         | **Test data**     | **Expected result**                                                                                                                                    | **Actual result** |
|--------------------------------------------------------------------------------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------|
| 1. Enter login name, that differs from the one provided in preconditions, in "Login Name" field. | Login name: bob11 | Entered login name must be visible inside "Login Name" field.                                                                                          |                   |
| 2. Enter password into "Password" field.                                                         | Password: bob12   | Entered password must be visible inside "Password" field.                                                                                              |                   |
| 3. Push "Login" button.                                                                          |                   | Login failed, the user is still on https://automationteststore.com/index.php?rt=account/login .The "incorrect login or password" prompt has to appear. |                   |

### 2.2.2. "Password" field tests

#### 2.2.2.1. Test case - Empty "Password" field

Priority:

Status:

Preconditions:
- the user is on https://automationteststore.com/index.php?rt=account/login ;
- there is a registered user account with login name = bob12, and password = bob12.

| **Step**                                     | **Test data**     | **Expected result**                                                                                                                                    | **Actual result** |
|----------------------------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------|
| 1. Enter login name into "Login name" field. | Login Name: bob12 | Entered login name must be visible inside "Login Name" field.                                                                                          |                   |
| 2. Push "Login" button.                      |                   | Login failed, the user is still on https://automationteststore.com/index.php?rt=account/login .The "incorrect login or password" prompt has to appear. |                   |

#### 2.2.2.2. Test case - Incorrect password

Priority:

Status:

Preconditions:
- the user is on https://automationteststore.com/index.php?rt=account/login ;
- there is a registered user account with login name = bob12, and password = bob12.

| **Step**                                                                                     | **Test data**     | **Expected result**                                                                                                                                    | **Actual result** |
|----------------------------------------------------------------------------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------|
| 1. Enter login name into "Login Name" field.                                                 | Login name: bob12 | Entered login name must be visible inside "Login Name" field.                                                                                          |                   |
| 2. Enter password, that differs from the one provided in preconditions, in "Password" field. | Password: bob22   | Entered password must be visible inside "Password" field.                                                                                              |                   |
| 3. Push "Login" button.                                                                      |                   | Login failed, the user is still on https://automationteststore.com/index.php?rt=account/login .The "incorrect login or password" prompt has to appear. |                   |
