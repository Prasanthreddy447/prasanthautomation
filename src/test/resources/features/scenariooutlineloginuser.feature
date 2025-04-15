Feature: user Login page feature outline

Scenario Outline: Valid Login admin outline

Given user is on Login Page
#When user enters credentials
When user enters username as "<username>" and password as "<password>!"
Then should display message success

Examples:
	|username|password					  |
	|tomsmith|SuperSecretPassword |
	|tomsmith|SuperSecretPassword1|
	|tomsmith|SuperSecretPasswordg|