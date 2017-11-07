#Author: Sukhwinder Singh
@URLs
Feature: PRD Redirect Asthma COPD Heartfailure Diabetes Maternity App

  Scenario Outline: Asthma URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                          | Page title |
      | https://phs.com/asthma         | https://www.phs.com/content/phs/en/phs/asthma.html   | Asthma     |
      | https://myuhc.phs.com/asthma   | https://myuhc.phs.com/content/phs/en/phs/asthma.html | Asthma     |
      | https://myoptum.phs.com/asthma | https://www.phs.com/content/phs/en/phs/asthma.html   | Asthma     |

  Scenario Outline: COPD URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                    | RedirectURL                                        | Page title |
      | https://phs.com/copd         | https://www.phs.com/content/phs/en/phs/copd.html   | COPD       |
      | https://myuhc.phs.com/copd   | https://myuhc.phs.com/content/phs/en/phs/copd.html | COPD       |
      | https://myoptum.phs.com/copd | https://www.phs.com/content/phs/en/phs/copd.html   | COPD       |

  Scenario Outline: Diabetes URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                        | RedirectURL                                            | Page title |
      | https://phs.com/diabetes         | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |
      | https://myuhc.phs.com/diabetes   | https://myuhc.phs.com/content/phs/en/phs/diabetes.html | Diabetes   |
      | https://myoptum.phs.com/diabetes | https://www.phs.com/content/phs/en/phs/diabetes.html   | Diabetes   |

  Scenario Outline: Heart failure URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                            | RedirectURL                                                | Page title    |
      | https://phs.com/heartfailure         | https://www.phs.com/content/phs/en/phs/heartfailure.html   | Heart Failure |
      | https://myuhc.phs.com/heartfailure   | https://myuhc.phs.com/content/phs/en/phs/heartfailure.html | Heart Failure |
      | https://myoptum.phs.com/heartfailure | https://www.phs.com/content/phs/en/phs/heartfailure.html   | Heart Failure |

  Scenario Outline: Maternity-Health Pregnency App URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                 | RedirectURL                                                   | Page title            |
      | https://phs.com/healthypregnancyapp       | https://www.phs.com/content/phs/en/healthypregnancyapp.html   | Healthy Pregnancy App |
      | https://myuhc.phs.com/healthypregnancyapp | https://myuhc.phs.com/content/phs/en/healthypregnancyapp.html | Healthy Pregnancy App |
