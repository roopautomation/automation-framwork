#Author: Sukhwinder Singh
@testdemo
Feature: Error message on pre call form

  Scenario: Error message with invalid phone number
    Given User is on recommended page
    When User click on Request call button
    Then Contact info section displayed
    When User click edit phone link
    And User enter phone number as "5444"
    And User click on Next button
    Then Phone error message displayed

  Scenario: Error message with invalid Email
    Given Contact info section displayed
    When User click on edit Email
    Then Email and confirm Email field displayed
    When User enter invalid Email as "test123"
    And User click next button on contact page
    Then Email error message displayed

  Scenario: Error message with invalid ComfirmEmail
    Given Contact info section displayed
    Then Email and confirm Email field displayed
    When User enter invalid confirmEmail as "confirm@optum"
    And User click next button on contact page
    Then ConfirmEmail error message displayed

  Scenario: Error message when email and confirmEmail not maching
    Given Contact info section displayed
    When User enter Email as "email@optum.com"
    And User enter confirmEmail as "confirm@optum.com"
    And User click next button on contact page
    Then Email not matching error message displayed

  Scenario: Green check mark displayed with both valid email
    Given User is on recommended page
    When User click on Request call button
    And Contact info section displayed
    And User click edit phone link
    And User enter phone number as "1234567890"
    And User click on edit Email
    And User enter Email as "green@optum.com"
    And User enter confirmEmail as "green@optum.com"
    Then Green check mark displayed
