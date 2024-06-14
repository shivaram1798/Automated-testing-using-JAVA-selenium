@tagg
Feature: Registration email check

	@tag2
	Scenario: Verifying registration page with same email
		Given registration page
		When User enters already regestered mail
		Then User is notifies with error message