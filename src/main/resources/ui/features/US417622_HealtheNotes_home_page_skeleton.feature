#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US417622 HealtheNotes home page skeleton

  Background: 
    Given Dashboard opens

  @Run
  Scenario: Dashboard skeleton displays correctly
    Then user sees a banner
    And user sees a component overlaying the banner image that contains text
    And user sees a small opportunity section
    And user sees a small actions section
    And user sees a survey section
    And user sees a large opportunity section
    And user sees a large actions section
    And user sees a resources section
    And user sees footer section
