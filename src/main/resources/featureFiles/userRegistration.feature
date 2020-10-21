Feature: User Registration scenario
	Scenario: User Registration
		Given Launch the application
		When User enter email id
		And the user fill the registration form with valid values
		Then User should be able to register a new account