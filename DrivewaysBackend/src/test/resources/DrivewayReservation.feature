Feature: User Reservation for Driveways application

  Background: 
		Given : User is logged into the app

    Scenario: Renter can request a reservation
	    Given : The Renter is on the reservation modal
	    When : The Renter selects from a list of available reservations
	    Then : The Renter claims that reservation
	    
    Scenario: Renter can cancel a reservation
	    Given : The Renter is on the reservation page
	    When : The Renter selects reservation from a list of their reserves
	    Then : The Renter cancelled that reservation
	    
	 	Scenario: Lister can create a reservation
	   	Given : The Lister is on the reservation modal
	   	When : The Lister clicks the reservation button
	   	Then : Form appears on modal
    
    Scenario: Lsiter can approve reservations
      Given : The Lister is on the reservation page
      When : The Lister selects approve button next to reservation
      Then : The reservation is approved

    Scenario: Lister can deny reservations
      Given : The Lister is on the reservation page
      When : The Lister selects deny button to reservation
      Then : The reservation is denied
