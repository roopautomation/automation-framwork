#Author: Sukhwinder Singh
@URLs
Feature: STG URL Redirects - Cancer, Fertility, Kidney, Maternity, and Transplant

  Scenario Outline: Cancer Resource Service URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                   | RedirectURL                                                         | Page title       |
      | https://stg.phs.com/cancersolutions         | https://stg.phs.com/content/phs/en/phs/cancersolutions.html         | Cancer Solutions |
      | https://stg-myuhc.phs.com/cancersolutions   | https://stg-myuhc.phs.com/content/phs/en/phs/cancersolutions.html   | Cancer Solutions |
      | https://stg-myoptum.phs.com/cancersolutions | https://stg-myoptum.phs.com/content/phs/en/phs/cancersolutions.html | Cancer Solutions |

  Scenario Outline: Fertility Solutions URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                      | RedirectURL                                                            | Page title          |
      | https://stg.phs.com/fertilitysolutions         | https://stg.phs.com/content/phs/en/phs/fertilitysolutions.html         | Fertility Solutions |
      | https://stg-myuhc.phs.com/fertilitysolutions   | https://stg-myuhc.phs.com/content/phs/en/phs/fertilitysolutions.html   | Fertility Solutions |
      | https://stg-myoptum.phs.com/fertilitysolutions | https://stg-myoptum.phs.com/content/phs/en/phs/fertilitysolutions.html | Fertility Solutions |

  Scenario Outline: Kidney Resource Services URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                             | Page title               |
      | https://stg.phs.com/krs         | https://stg.phs.com/content/phs/en/phs/krs.html         | Kidney Resource Services |
      | https://stg-myuhc.phs.com/krs   | https://stg-myuhc.phs.com/content/phs/en/phs/krs.html   | Kidney Resource Services |
      | https://stg-myoptum.phs.com/krs | https://stg-myoptum.phs.com/content/phs/en/phs/krs.html | Kidney Resource Services |

  Scenario Outline: Transplant Resources Service URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                             | Page title                  |
      | https://stg.phs.com/trs         | https://stg.phs.com/content/phs/en/phs/trs.html         | Transplant Resource Services |
      | https://stg-myuhc.phs.com/trs   | https://stg-myuhc.phs.com/content/phs/en/phs/trs.html   | Transplant Resource Services |
      | https://stg-myoptum.phs.com/trs | https://stg-myoptum.phs.com/content/phs/en/phs/trs.html | Transplant Resource Services |

  Scenario Outline: Maternity Support URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                    | RedirectURL                                                          | Page title        |
      | https://stg.phs.com/maternitysupport         | https://stg.phs.com/content/phs/en/phs/maternitysupport.html         | Maternity Support |
      | https://stg-myuhc.phs.com/maternitysupport   | https://stg-myuhc.phs.com/content/phs/en/phs/maternitysupport.html   | Maternity Support |
      | https://stg-myoptum.phs.com/maternitysupport | https://stg-myoptum.phs.com/content/phs/en/phs/maternitysupport.html | Maternity Support |
