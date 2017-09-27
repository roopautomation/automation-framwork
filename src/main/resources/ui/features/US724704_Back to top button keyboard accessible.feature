#Author: Sukhwinder Singh
@sprint31
Feature: Back to top button key accessible.

  Scenario: Access back to top button with tab key.
    Given User is on PHS page.
    When User navigate to footer Component.
    And User access Back to top button with tab key.
    And User press Enter key from keyboard.
    Then User is taken back to top of page.
    When User again navigate to footer Component.
    And User click on back to top button
    Then User is taken back to top of page.
