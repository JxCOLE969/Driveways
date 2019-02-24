Feature: User Login for Driveways App

  Scenario: User tries to open login form
    Given : The user is on the landing page
    When : The user clicks Login
    Then : The Login modal appears
    
	Scenario: User tries to login to their account
		Given : The user is on the login screen
		When : The user enters a correct username and password
		Then : The user is signed in
	
	Scenario: User registers an account
		Given : The user is on the register screen
		When : The user enters valid information
		Then : The account is created