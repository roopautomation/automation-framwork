#Author: Sukhwinder Singh
@prod  @test
Feature: US787926 PRD Redirect Asthma, Diabetes, Healthy Pregnency App

  Scenario Outline: Asthma URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                       | RedirectURL                                          | Page title |
      | https://phs.com/asthma         | https://www.phs.com/content/phs/en/phs/asthma.html   | Asthma     |
      | https://myuhc.phs.com/asthma   | https://myuhc.phs.com/content/phs/en/phs/asthma.html | Asthma     |
      | https://phs.com/ASTHMA         | https://www.phs.com/content/phs/en/phs/asthma.html   | Asthma     |
      | https://myuhc.phs.com/ASTHMA   | https://myuhc.phs.com/content/phs/en/phs/asthma.html | Asthma     |
  ##  | https://myoptum.phs.com/asthma | https://www.phs.com/content/phs/en/phs/asthma.html   | Asthma     |
      
  Scenario Outline: Diabetes URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                         | RedirectURL                                            | Page title |
      | https://phs.com/diabetes         | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |
      | https://myuhc.phs.com/diabetes   | https://myuhc.phs.com/content/phs/en/phs/diabetes.html | Diabetes   |
      | https://www.phs.com/diabetes     | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |
      | https://www.phs.com/DIABETES     | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |
      | https://phs.com/DIAbetes         | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |
      | https://myuhc.phs.com/DIABETES   | https://myuhc.phs.com/content/phs/en/phs/diabetes.html | Diabetes   |
 ##   | https://myoptum.phs.com/diabetes | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |

  Scenario Outline: Health Pregnency App URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                                  | RedirectURL                                                   | Page title            |
      | https://phs.com/healthypregnancyapp       | https://www.phs.com/content/phs/en/healthypregnancyapp.html   | Healthy Pregnancy App |
      | https://www.phs.com/healthypregnancyAPP   | https://www.phs.com/content/phs/en/healthypregnancyapp.html   | Healthy Pregnancy App |
      | https://www.phs.com/healthypregNANCYapp   | https://www.phs.com/content/phs/en/healthypregnancyapp.html   | Healthy Pregnancy App |
      | https://myuhc.phs.com/healthypregnancyapp | https://myuhc.phs.com/content/phs/en/healthypregnancyapp.html | Healthy Pregnancy App |
      | https://phs.com/healthypregnancyAPP       | https://www.phs.com/content/phs/en/healthypregnancyapp.html   | Healthy Pregnancy App |
      | https://myuhc.phs.com/HEALTHYpregnancyapp | https://myuhc.phs.com/content/phs/en/healthypregnancyapp.html | Healthy Pregnancy App |
      
      
      
