#Author: Sukhwinder Singh
Feature: Programm referal pre call form integration

  Scenario: Store Members Preferred Call Back Times
    Given The <member> has clicked the CTA to Request A Call
    When The <member> arrives on the Select Times page
    And The <member> selects their preferred call back time(s)
    And The <member> clicks the Next button
    Then The API should be triggered to save call back data 

  Scenario: Store Members Edited Phone Number and phone type
    Given The <member> has completed preferred time and is on Confirm Contact Info page
    When The <member> edits their phone number as "1212121212"
    And The <member> selects the phone number types as "Mobile"
    And The <member> clicks the Next button
    Then The API should be triggered to save phone data

  Scenario: Store Members Questionnaire Questions & Corresponding Responses
    Given The <member> has completed  Select Times & Confirm Contact Info page
    And The <member> arrives on the "Answer 3 Questions" page
    When The <member> enters <data> in all text fields
    And The member clicks the Finish button
    Then The API should be triggered to save questionnaire data