#Author: Sukhwinder Singh
@prod  @test
Feature: US854977 PROD URLs Redirects for Fertility, Kidney, Maternity, TRS, SJS, COPD & Heart

  Scenario Outline: Fertility Solutions URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                                   | RedirectURL                                                            | Page title          |
      | https://phs.com/fertilitySOLUtions         | https://www.phs.com/content/phs/en/phs/fertilitysolutions.html         | Fertility Solutions |
      | https://phs.com/fertilitysolutions         | https://www.phs.com/content/phs/en/phs/fertilitysolutions.html         | Fertility Solutions |
      | https://www.phs.com/fertilitySOLUTIONS     | https://www.phs.com/content/phs/en/phs/fertilitysolutions.html         | Fertility Solutions |
      | https://myuhc.phs.com/fertilitysolutions   | https://myuhc.phs.com/content/phs/en/phs/fertilitysolutions.html       | Fertility Solutions |
      | https://myoptum.phs.com/fertilitysolutions | https://myoptum.phs.com/content/optum/en/optum/fertilitysolutions.html | Fertility Solutions |
      | https://myuhc.phs.com/FERTILITYsolutions   | https://myuhc.phs.com/content/phs/en/phs/fertilitysolutions.html       | Fertility Solutions |
      | https://myoptum.phs.com/FERtilitysolutions | https://myoptum.phs.com/content/optum/en/optum/fertilitysolutions.html | Fertility Solutions |

  Scenario Outline: Kidney Resource Services URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                             | Page title               |
      | https://phs.com/krs         | https://www.phs.com/content/phs/en/phs/krs.html         | Kidney Resource Services |
      | https://www.phs.com/krs     | https://www.phs.com/content/phs/en/phs/krs.html         | Kidney Resource Services |
      | https://myuhc.phs.com/krs   | https://myuhc.phs.com/content/phs/en/phs/krs.html       | Kidney Resource Services |
      | https://myoptum.phs.com/krs | https://myoptum.phs.com/content/optum/en/optum/krs.html | Kidney Resource Services |
      | https://phs.com/KRS         | https://www.phs.com/content/phs/en/phs/krs.html         | Kidney Resource Services |
      | https://www.phs.com/KRS     | https://www.phs.com/content/phs/en/phs/krs.html         | Kidney Resource Services |
      | https://myuhc.phs.com/KRS   | https://myuhc.phs.com/content/phs/en/phs/krs.html       | Kidney Resource Services |
      | https://myoptum.phs.com/KRS | https://myoptum.phs.com/content/optum/en/optum/krs.html | Kidney Resource Services |

  Scenario Outline: Transplant Resources Service URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                  | RedirectURL                                       | Page title                   |
      | https://phs.com/trs       | https://www.phs.com/content/phs/en/phs/trs.html   | Transplant Resource Services |
      | https://www.phs.com/trs   | https://www.phs.com/content/phs/en/phs/trs.html   | Transplant Resource Services |
      | https://myuhc.phs.com/trs | https://myuhc.phs.com/content/phs/en/phs/trs.html | Transplant Resource Services |
      | https://phs.com/TRS       | https://www.phs.com/content/phs/en/phs/trs.html   | Transplant Resource Services |
      | https://www.phs.com/TRS   | https://www.phs.com/content/phs/en/phs/trs.html   | Transplant Resource Services |
      | https://myuhc.phs.com/TRS | https://myuhc.phs.com/content/phs/en/phs/trs.html | Transplant Resource Services |

  Scenario Outline: Maternity Support URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                                 | RedirectURL                                                          | Page title        |
      | https://phs.com/maternitysupport         | https://www.phs.com/content/phs/en/phs/maternitysupport.html         | Maternity Support |
      | https://www.phs.com/maternitysupport     | https://www.phs.com/content/phs/en/phs/maternitysupport.html         | Maternity Support |
      | https://myuhc.phs.com/maternitysupport   | https://myuhc.phs.com/content/phs/en/phs/maternitysupport.html       | Maternity Support |
      | https://myoptum.phs.com/maternitysupport | https://myoptum.phs.com/content/optum/en/optum/maternitysupport.html | Maternity Support |
      | https://phs.com/maternitySUPport         | https://www.phs.com/content/phs/en/phs/maternitysupport.html         | Maternity Support |
      | https://www.phs.com/maternitysupPORT     | https://www.phs.com/content/phs/en/phs/maternitysupport.html         | Maternity Support |
      | https://myuhc.phs.com/materNITYsupport   | https://myuhc.phs.com/content/phs/en/phs/maternitysupport.html       | Maternity Support |
      | https://myoptum.phs.com/MATERnitysupport | https://myoptum.phs.com/content/optum/en/optum/maternitysupport.html | Maternity Support |

  Scenario Outline: Spine and Joint Solution (sjs) URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                             | Page title               |
      | https://phs.com/sjs         | https://www.phs.com/content/phs/en/phs/sjs.html         | Spine and Joint Solution |
      | https://www.phs.com/sjs     | https://www.phs.com/content/phs/en/phs/sjs.html         | Spine and Joint Solution |
      | https://myuhc.phs.com/sjs   | https://myuhc.phs.com/content/phs/en/phs/sjs.html       | Spine and Joint Solution |
      | https://myoptum.phs.com/sjs | https://myoptum.phs.com/content/optum/en/optum/sjs.html | Spine and Joint Solution |
      | https://phs.com/SJS         | https://www.phs.com/content/phs/en/phs/sjs.html         | Spine and Joint Solution |
      | https://www.phs.com/SJS     | https://www.phs.com/content/phs/en/phs/sjs.html         | Spine and Joint Solution |
      | https://myuhc.phs.com/SJS   | https://myuhc.phs.com/content/phs/en/phs/sjs.html       | Spine and Joint Solution |
      | https://myoptum.phs.com/SJS | https://myoptum.phs.com/content/optum/en/optum/sjs.html | Spine and Joint Solution |

  Scenario Outline: COPD Services URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                     | RedirectURL                                              | Page title |
      | https://phs.com/copd         | https://www.phs.com/content/phs/en/phs/copd.html         | COPD       |
      | https://www.phs.com/copd     | https://www.phs.com/content/phs/en/phs/copd.html         | COPD       |
      | https://myuhc.phs.com/copd   | https://myuhc.phs.com/content/phs/en/phs/copd.html       | COPD       |
      | https://www.phs.com/COPD     | https://www.phs.com/content/phs/en/phs/copd.html         | COPD       |
      | https://phs.com/COPD         | https://www.phs.com/content/phs/en/phs/copd.html         | COPD       |
      | https://myuhc.phs.com/COPD   | https://myuhc.phs.com/content/phs/en/phs/copd.html       | COPD       |
  ##  | https://myoptum.phs.com/COPD | https://myoptum.phs.com/content/optum/en/optum/copd.html | COPD       |
  ##  | https://myoptum.phs.com/copd | https://myoptum.phs.com/content/optum/en/optum/copd.html | COPD       |

  Scenario Outline: Heart (formerly Heart Failure) URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                      | RedirectURL                                               | Page title    |
      | https://phs.com/heart         | https://www.phs.com/content/phs/en/phs/heart.html         | Heart Failure |
      | https://www.phs.com/heart     | https://www.phs.com/content/phs/en/phs/heart.html         | Heart Failure |
      | https://myuhc.phs.com/heart   | https://myuhc.phs.com/content/phs/en/phs/heart.html       | Heart Failure |
      | https://phs.com/HEART         | https://www.phs.com/content/phs/en/phs/heart.html         | Heart Failure |
      | https://www.phs.com/HEART     | https://www.phs.com/content/phs/en/phs/heart.html         | Heart Failure |
      | https://myuhc.phs.com/HEART   | https://myuhc.phs.com/content/phs/en/phs/heart.html       | Heart Failure |
  ##  | https://myoptum.phs.com/heart | https://myoptum.phs.com/content/optum/en/optum/heart.html | Heart Failure |
