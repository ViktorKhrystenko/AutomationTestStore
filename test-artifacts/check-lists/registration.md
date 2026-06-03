# Registration

## First (Last) Name

- empty first (last) name
- more than 32 characters first (last) name
- only spaces first (last) name (also can be checked with other fields)
- 1-32 characters first (last) name with prohibited characters

## E-Mail

- empty email
- test according to email rules on https://help.xmatters.com/ondemand/trial/valid_email_format.htm and https://en.wikipedia.org/wiki/Email_address#Syntax (there are rules and examples of valid and invalid emails)
- register on already used email
- register with temporary email

## Telephone

- less than 7 digits telephone
- more than 15 digits telephone
- not leading +
- without country code
- 7-15 digits telephone with prohibited characters
- register on already used telephone

## Fax

## Company

## Address 1 (2)

- empty address 1
- less than 3 characters address 1 (2)
- more than 128 characters ing address 1 (2)
- empty address 1, filled address 2 (should pass?)
- equal valid values in address 1 and 2 (should fail)

## City

- empty city
- less than 3 characters city
- more than 128 characters city
- 3-128 characters city with prohibited characters

## Zip Code

- empty zip code
- less than 3 characters zip code
- more than 10 characters zip code
- 3-10 characters zip code with prohibited characters

## Country - Region / State

- default country - region/state values
- effect of changing country on region/state dropdown (should reset to default value)

## Login name

- empty login name
- less than 5 characters login name
- more than 64 characters login name
- 5-64 characters login name with prohibited characters
- register with already used login name

## Password (Confirm)

- less than 4 characters password
- more than 10 characters password
- empty password, filled password confirm
- empty password confirm, filled password
- confirmation error

## Newsletter

- newsletter radio button is present, but nothing is chosen by default (bug)
- registration proceeds with nothing selected in newsletter radio button (bug)

## Privacy Policy

- not checked policy checkbox

## Other checks

- put js code into field with less strict validation (company)
- send HTTP with invalid registration data directly to server via Postman
