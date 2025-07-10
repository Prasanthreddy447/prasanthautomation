Feature: user login data table

Scenario: Valid login data table
Given user is on Login Page
When user enters credentials
	| tomsmith | SuperSecretPassword!   |
	|username  | shsgah                 |
Then should display message success
	|You logged into a secure area!!|