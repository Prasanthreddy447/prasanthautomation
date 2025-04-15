Feature: user login data table with map

Scenario: Valid login data table with map
Given user is on Login Page
When user enters credentials
	 |username | password             |
	| tomsmith | SuperSecretPassword! |
Then should display message success
	|You logged into a secure area!|