# ID: BR-REG-16

## Summary

Incorrect error message on empty "ZIP Code" field during registration

## Reproducibility: Always

## Severity: Low

## Priority: Low

## Workaround:

No

## Description

If registration form has been submitted with empty "ZIP Code" field, returned error message says "ZIP Code must be between 1 and 10 characters!".

| Expected result                                                                                              | Actual result                                                                                       |
|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| Error message "ZIP Code must not be empty!" is displayed next to "ZIP Code" field on "Continue" button click | Error message "ZIP Code must be between 1 and 10 characters!" is displayed next to "ZIP Code" field |

### Violated requirement: [DS-REG-09.01](./../../../requirements/registration-requirements.md#ds-reg-10-zip-code)

## Steps to reproduce:

Preconditions:
1. You are logged out.

Steps:
1. Navigate to registration page (https://automationteststore.com/index.php?rt=account/create);
2. Do not fill "ZIP Code" field and click on "Continue" button (state of other fields does not matter);

## Comments

\-

## Attachments

![](./../../0screenshots/registration/zip-code/BR-REG-16.png)
