Feature: user Login page feature

Scenario: Valid Login admin

Given user is on Login Page
# static When user enters credentials
When user enters username as "tomsmith" and password as "SuperSecretPassword!" (parameterization)
Then should display message success
