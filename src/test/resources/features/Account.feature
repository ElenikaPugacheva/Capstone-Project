Feature: Retail Account Page
  Note: For this feature you have to have an account and be logged in into account. Repeated steps are 
  under Background Keyword

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'elenapugacheva@tekschool.com' and password 'N7441904#n'
    And User click on login button
    And User should be logged in into Account

  @tc-003
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Mona' and Phone '3477441904'
    And User click on Update button
    Then User profile information should be updated

  @tc-004 @passwordChanged @smokeTest
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | 'N7441904#n'     | 'Tek@1234'  | 'Tek@1234'      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @tc-005
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567890987654 | 'Elena'    |              11 |           2029 |          308 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @tc-006
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1098765432123456 | 'Levan'    |              10 |           2023 |          803 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @tc-007
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @tc-008
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country    | fullName | phoneNumber | streetAddress     | apt  | city     | state | zipCode |
      | Uzbekistan | 'Monica' |  3472658145 | '8414 143 street' | '4c' | New York | NY    |   11435 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @tc-009
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress       | apt  | city      | state | zipCode |
      | USA     | 'George' |  3477441907 | '15134 Rothesay Dr' | '1c' | Charlotte | NC    |   28277 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @tc-010
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
