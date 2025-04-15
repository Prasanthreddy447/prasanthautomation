Feature: user Login page feature

Scenario: Valid Login admin

Given user is on Login Page
#When user enters credentials
When user enters username as "tomsmith" and password as "SuperSecretPassword!"
Then should display message success
