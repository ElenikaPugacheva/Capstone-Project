Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    

  @firstTest
  Scenario: Verify user can sign in into Retail Application
    When User click on Sign in option
    And User enter email 'elenapugacheva@tekschool.com' and password 'N7441904#n'
    And User click on login button
    Then User should be logged in into Account

  @secondTest @Regression @registerAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email                 | password | confirmPassword |
      | molena | molena271@tekschool.us | Tek@1234 | Tek@1234        |
    And User click on SignUp button
    Then User should be logged into account page
    
    
