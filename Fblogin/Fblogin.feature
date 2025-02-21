Feature: login feature
  Here are validating the login feature Test cases


  Scenario: Validate the login funcationlity with valid username and password
    Given user is on login page
    When user enters valid username "Testing@gmail.com"
    When user enters valid password "P23rws23343"
    And clicks on submit
    Then user will navigated to home page
    

  
  