#Author: Sukhwinder Singh
@stage
Feature: US848702 STG URLs for BRS, TPH  and 3 TPH Client pages

  Scenario Outline: Bariatric Resource Services (BRS) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                                 | Page title                  |
      | https://stg.phs.com/brs         | https://stg.phs.com/content/phs/en/phs/brs.html             | Bariatric Resource Services |
      | https://stg-myuhc.phs.com/brs   | https://stg-myuhc.phs.com/content/phs/en/phs/brs.html       | Bariatric Resource Services |
      | https://stg-myoptum.phs.com/brs | https://stg-myoptum.phs.com/content/optum/en/optum/brs.html | Bariatric Resource Services |
      | https://stg.phs.com/BRS         | https://stg.phs.com/content/phs/en/phs/brs.html             | Bariatric Resource Services |
      | https://stg-myuhc.phs.com/BRS   | https://stg-myuhc.phs.com/content/phs/en/phs/brs.html       | Bariatric Resource Services |
      | https://stg-myoptum.phs.com/BRS | https://stg-myoptum.phs.com/content/optum/en/optum/brs.html | Bariatric Resource Services |

  Scenario Outline: Total Population Health Value URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                       | Page title |
      | https://stg.phs.com/tph       | https://stg.phs.com/content/phs/en/tph.html       | TPH        |
      | https://stg-myuhc.phs.com/tph | https://stg-myuhc.phs.com/content/phs/en/tph.html | TPH        |
      | https://stg.phs.com/TPH       | https://stg.phs.com/content/phs/en/tph.html       | TPH        |
      | https://stg-myuhc.phs.com/TPH | https://stg-myuhc.phs.com/content/phs/en/tph.html | TPH        |

  Scenario Outline: Client 1 (Samsung Austin Semiconductor) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                           | Page title |
      | https://stg.phs.com/sas       | https://stg.phs.com/content/phs/en/tph/sas.html       |            |
      | https://stg-myuhc.phs.com/sas | https://stg-myuhc.phs.com/content/phs/en/tph/sas.html |            |
      | https://stg.phs.com/SAS       | https://stg.phs.com/content/phs/en/tph/sas.html       |            |
      | https://stg-myuhc.phs.com/SAS | https://stg-myuhc.phs.com/content/phs/en/tph/sas.html |            |

  Scenario Outline: Client 2 (CSAA) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                            | Page title       |
      | https://stg.phs.com/csaa       | https://stg.phs.com/content/phs/en/tph/csaa.html       | Health Advantage |
      | https://stg-myuhc.phs.com/csaa | https://stg-myuhc.phs.com/content/phs/en/tph/csaa.html | Health Advantage |
      | https://stg.phs.com/CSAA       | https://stg.phs.com/content/phs/en/tph/csaa.html       | Health Advantage |
      | https://stg-myuhc.phs.com/CSAA | https://stg-myuhc.phs.com/content/phs/en/tph/csaa.html | Health Advantage |

  Scenario Outline: Client 3 (Parsons Corporation) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                         | RedirectURL                                               | Page title |
      | https://stg.phs.com/parsons       | https://stg.phs.com/content/phs/en/tph/parsons.html       |            |
      | https://stg-myuhc.phs.com/parsons | https://stg-myuhc.phs.com/content/phs/en/tph/parsons.html |            |
      | https://stg.phs.com/PARSONS       | https://stg.phs.com/content/phs/en/tph/parsons.html       |            |
      | https://stg-myuhc.phs.COM/parsons | https://stg-myuhc.phs.com/content/phs/en/tph/parsons.html |            |
