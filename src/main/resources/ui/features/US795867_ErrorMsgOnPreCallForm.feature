#Author: Sukhwinder Singh
Feature: Error message on pre call form

  Scenario: Error message with invalid phone number
    Given User is on recommended page
    When User click on Request call button
    Then Preferred Time section displayed
    When User click CTA button
    Then Contact info section displayed
    When User click edit phone link and enter invalid phone as "4444"
    And User click on Next button
    Then Error message displayed

  Scenario: Error message with invalid Email
    Given Contact info section displayed
    When User click on edit Email
    Then Email and confirm Email field displayed
    When User enter invalid Email as "test123" and click next button
    Then Error message displayed
    When User enter email as ""and confirm as ""
    And User click next button
    Then Error message displayed with confirm field
