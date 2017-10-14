#Author: your.email@your.domain.com
Feature: List of scenarios.

  Scenario Outline: Saving edited Email in data
    Given Member exists with HSID as "<hsid>"
    When User set post URI as "<URI>"
    And User post the request as ""
    Then User get success message
    When User set URI to get request
    Then Edited Email is verified

    Examples: 
      | hsid | URI               |
      |      | /preferredcontact |
