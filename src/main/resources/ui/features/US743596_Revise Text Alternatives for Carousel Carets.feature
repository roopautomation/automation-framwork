##Author: Sukhwinder Singh
Feature: Revise Text Alternatives for Carousel Carets.

  Background: 
    Given User is on PHS page.

  Scenario: Verify Left and Right carets for Carousel is key accessible.
    When User navigate to Carousel Component.
    Then User note sliding indicator position.
    When User access Left carets Carousel with TAB key and ENTER.
    Then Slide display in carousel is moved to next.
    Then User note sliding indicator position again.
    When User access Right carets Carousel with TAB key and ENTER.
    Then Slide display in carousel is moved to next again.

    Scenario: Verify Left and Right carets for Carousel are mouse clickable.
    When User navigate to Carousel Component.
    Then User note sliding indicator position.
    And User click on Left carets Carousel.
    Then Slide display in carousel is moved to next.
    Then User note sliding indicator position again.
    And User click Right carets Carousel.
    Then Slide display in carousel is moved to next again.