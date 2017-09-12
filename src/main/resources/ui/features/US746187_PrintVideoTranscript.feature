#Author: Sukhwinder Singh
@sprint3
Feature: Print video Transcript

  Background: 
    Given User is on PHS page.
    And Transcript link is displayed

  Scenario: Verify Transcript is printable
    When User scroll to video component
    And User click on "View Transcript" link
    Then A Link " Print Transcript" displayed
    When User click on PRINT TRANSCRIPT link
    Then PDF of transcript open in new TAB
    And User Verify title of new TAB "pdf"
