#Author: Sukhwinder Singh
@test
Feature: Programm referal pre call form integration

  Scenario Outline: Store Members Edited Phone Number and phone type
    Given User is on recommended page
    When The user has clicked the CTA to Request A Call
    Then User is on Contact info section
    When User click edit phone link
    And The user selects the phone number types as <PhoneType>
    And User enter phone number as <Number>

    Examples: 
      | PhoneType | Number     |
      | Home      | 1234511111 |

  Scenario: User edit email and save
    Given Send email option is default checked
    And Member email is displayed
    When User click on edit Email
    And User enter Email as "1green@optum.com"
    And User enter confirmEmail as "1green@optum.com"
    And User click on Next button
    Then Preferred Time section displayed

  Scenario: Store Members Preferred Call Back Times
    Given User complete contact info and is on preferred time page
    And The user selects their preferred call back time as "Mornings"
    And The user clicks the Next button
    Then Question section tab display
    Then The API should be triggered to save call back data

  Scenario: Store Members Questionnaire Questions & Corresponding Responses
    Given The user has completed  Select Times and is on question page
    When The user enters data in first answer fields as "Answer one entered by automation1"
    And The user enters data in second answer fields as "Answer two entered by automation2"
    And The user enters data in third answer fields as "Answer tree entered by automation3"
    And The member clicks the Finish button
    Then Confirmation page display
    Then The API should be triggered to save questionnaire data

  Scenario: Verify data in detail page
    Given Confirmation page display
    When user click on show More link
    Then Detail page displayed
    And User verify Phone Type
    And User verify Phone Number
    And edit link for phone and phoneType displayed
    And User verify Preferred time selected
    And User verify Answer text
