Feature: Users work with listings 

  Background: 
  	Given : The user is logged in to the app
  	
  Scenario: Renter can view all listings
    Given : The user is on the home page
    And : The user is a renter
    Then : The user can view all listings
    
  Scenario: Lister can view all listings
    Given : The user is on the home page
    And : The user is a lister
    Then : The user can view their own listings
  
  Scenario: Lister can view their own listings
    Given : The user is on the home page
    And : The user is a lister
    When : the user clicks My Listings
    Then : The user's listings are loaded on the page
    

