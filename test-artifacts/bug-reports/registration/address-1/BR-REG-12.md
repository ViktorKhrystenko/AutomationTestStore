# ID: BR-REG-12

## Summary

Incorrect message on empty "Address 1" field during registration

## Reproducibility: Always

## Severity: Low

## Priority: Low

## Workaround:

No

## Description

If registration form has been submitted with empty "Address 1" field, returned error message says "Address 1 must be between 3 and 128 characters!".

| Expected result                                                                                                | Actual result                                                                                          |
|----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| Error message "Address 1 must not be empty!" is displayed next to "Address 1" field on "Continue" button click | Error message "Address 1 must be between 3 and 128 characters!" is displayed next to "Address 1" field |

### Violated requirement: [DS-REG-07.01](./../../../requirements/registration-requirements.md#ds-reg-07-address-1)

## Steps to reproduce:

Preconditions:
1. You are logged out.

Steps:
1. Navigate to registration page (https://automationteststore.com/index.php?rt=account/create);
2. Do not fill "Address 1" field and click on "Continue" button (state of other fields does not matter);

## Comments

\-

## Attachments

![](./../../0screenshots/registration/address-1/BR-REG-12.png)
