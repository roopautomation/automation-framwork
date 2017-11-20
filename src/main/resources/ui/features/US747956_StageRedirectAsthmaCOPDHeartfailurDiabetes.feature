#Author: Sukhwinder Singh
@stage
Feature: US747956 STG URL Redirects Asthma, COPD, Heart, Diabetes, CAD,
       Maternity-Health Pregnency App, Health Suport, Spine and Joint Solution (sjs)

  Scenario Outline: Asthma URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                        | RedirectURL                                              | Page title |
      | https://stg.phs.com/asthma       | https://stg.phs.com/content/phs/en/phs/asthma.html       | Asthma     |
      | https://stg-myuhc.phs.com/asthma | https://stg-myuhc.phs.com/content/phs/en/phs/asthma.html | Asthma     |

  ##    | https://stg-myoptum.phs.com/asthma | https://stg-myoptum.phs.com/content/phs/en/phs/asthma.html | Asthma     |
  Scenario Outline: COPD URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                            | Page title |
      | https://stg.phs.com/copd       | https://stg.phs.com/content/phs/en/phs/copd.html       | COPD       |
      | https://stg-myuhc.phs.com/copd | https://stg-myuhc.phs.com/content/phs/en/phs/copd.html | COPD       |
      | https://stg.phs.com/COPD       | https://stg.phs.com/content/phs/en/phs/copd.html       | COPD       |
      | https://stg-myuhc.phs.com/COPD | https://stg-myuhc.phs.com/content/phs/en/phs/copd.html | COPD       |

  ##   | https://stg-myoptum.phs.com/copd | https://stg-myoptum.phs.com/content/phs/en/phs/copd.html | COPD       |
  Scenario Outline: Diabetes URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                          | RedirectURL                                                | Page title |
      | https://stg.phs.com/diabetes       | https://stg.phs.com/content/phs/en/phs/diabetes.html       | Diabetes   |
      | https://stg-myuhc.phs.com/diabetes | https://stg-myuhc.phs.com/content/phs/en/phs/diabetes.html | Diabetes   |

  ##  | https://stg-myoptum.phs.com/diabetes | https://stg-myoptum.phs.com/content/phs/en/phs/diabetes.html | Diabetes   |
  Scenario Outline: Heart failure URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                             | Page title    |
      | https://stg.phs.com/heart       | https://stg.phs.com/content/phs/en/phs/heart.html       | Heart Failure |
      | https://stg-myuhc.phs.com/heart | https://stg-myuhc.phs.com/content/phs/en/phs/heart.html | Heart Failure |

  ##   | https://stg-myoptum.phs.com/heart | https://stg-myoptum.phs.com/content/phs/en/phs/heart.html | Heart Failure |
  Scenario Outline: Maternity-Health Pregnency App URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                     | RedirectURL                                                       | Page title            |
      | https://stg.phs.com/healthypregnancyapp       | https://stg.phs.com/content/phs/en/healthypregnancyapp.html       | Healthy Pregnancy App |
      | https://stg-myuhc.phs.com/healthypregnancyapp | https://stg-myuhc.phs.com/content/phs/en/healthypregnancyapp.html | Healthy Pregnancy App |

  Scenario Outline: Health Suport URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                   | RedirectURL                                             | Page title     |
      | https://stg.phs.com         | https://stg.phs.com/content/phs/en/phs.html             | Health Support |
      | https://stg-myoptum.phs.com | https://stg-myoptum.phs.com/content/optum/en/optum.html | Health Support |
      | https://stg-myuhc.phs.com   | https://stg-myuhc.phs.com/content/phs/en/phs.html       | Health Support |

  Scenario Outline: Spine and Joint Solution (sjs) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                                 | Page title               |
      | https://stg.phs.com/SJS         | https://stg.phs.com/content/phs/en/phs/sjs.html             | Spine and Joint Solution |
      | https://stg.phs.com/sjs         | https://stg.phs.com/content/phs/en/phs/sjs.html             | Spine and Joint Solution |
      | https://stg-myuhc.phs.com/SJS   | https://stg-myuhc.phs.com/content/phs/en/phs/sjs.html       | Spine and Joint Solution |
      | https://stg-myuhc.phs.com/sjs   | https://stg-myuhc.phs.com/content/phs/en/phs/sjs.html       | Spine and Joint Solution |
      | https://stg-myoptum.phs.com/SJS | https://stg-myoptum.phs.com/content/optum/en/optum/sjs.html | Spine and Joint Solution |
      | https://stg-myoptum.phs.com/sjs | https://stg-myoptum.phs.com/content/optum/en/optum/sjs.html | Spine and Joint Solution |

  Scenario Outline: CAD URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                        | RedirectURL                                                 | Page title              |
      | https://stg.phs.com/CAD          | https://stg.phs.com/content/phs/en/phs/cad.html             | Coronary Artery Disease |
      | https://stg.phs.com/cad          | https://stg.phs.com/content/phs/en/phs/cad.html             | Coronary Artery Disease |
      | https://stg-myuhc.phs.com/cad    | https://stg-myuhc.phs.com/content/phs/en/phs/cad.html       | Coronary Artery Disease |
      | https://stg-myuhc.phs.com/CAD    | https://stg-myuhc.phs.com/content/phs/en/phs/cad.html       | Coronary Artery Disease |
      | https://stg-myoptum.phs.com/cad  | https://stg-myoptum.phs.com/content/optum/en/optum/cad.html | Coronary Artery Disease |
      | https://stg-myoptum.phs.com/CAD  | https://stg-myoptum.phs.com/content/optum/en/optum/cad.html | Coronary Artery Disease |
