Feature: Users work with listings 

  Background: 
  	Given : The user is logged in to the app
  	
  Scenario: Renter can view all listings
    Given The user is on the home page
    And The user is a renter
    Then The user can view all listings
    
  Scenario: Lister can view their own listings
    Given The user is on the home page
    And The user is a lister
    Then The user can view their own listings
    

