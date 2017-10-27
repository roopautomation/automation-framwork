#Author: Sukhwinder Singh
@testdemo
Feature: FAQ Updates to default state open

  Scenario: FAQ page displays with all questions defauld open
    Given User is on PHS page.
    When User scroll to footer
    And User click on FAQ link
    Then FAQ page displayed with title "FAQs"
    And Default FAQs are closed with Text color "#196ecf"
    When User click on open/close button
    Then FAQ open and text color is changed
