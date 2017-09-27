
@Release0.0.1 @Sprint1
Feature: US402374 Landing Page Footers

  Background: 
    Given Landing Page opens

@TryIt
  Scenario: Verify footers links navigate to correct URLs and display correctly
    When User clicks Terms of Use
    Then Terms of Use page loads
    When User clicks Privacy Policy
    Then Privacy Policy page loads
    When User clicks English Language Assistance link
    Then Language Assistance page loads
    When User clicks Spanish Language Assistance link
    Then Language Assistance page loads
    When User clicks Chinese Language Assistance link
    Then Language Assistance page loads
  ##  And all language assistance links display in 12 point font
   And all links are AEM authorable
