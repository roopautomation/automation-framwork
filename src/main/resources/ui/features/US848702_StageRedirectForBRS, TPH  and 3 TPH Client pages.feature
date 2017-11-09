#Author: Sukhwinder Singh
@URLs1
Feature: Redirect STG URLs for BRS, TPH  and 3 TPH Client pages

  Scenario Outline: Bariatric Resource Services (BRS) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                             | Page title |
      | https://stg.phs.com/brs         | https://stg.phs.com/content/phs/en/phs/brs.html         |  bariatric Resource services          |
      | https://stg-myuhc.phs.com/brs   | https://stg-myuhc.phs.com/content/phs/en/phs/brs.html   |  bariatric Resource services          |
      | https://stg-myoptum.phs.com/brs | https://stg-myoptum.phs.com/content/phs/en/phs/brs.html |  bariatric Resource services          |

  Scenario Outline: Total Population Health Value URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                       | Page title |
      | https://stg.phs.com/tph       | https://stg.phs.com/content/phs/en/tph.html       |            |
      | https://stg-myuhc.phs.com/tph | https://stg-myuhc.phs.com/content/phs/en/tph.html |            |

  Scenario Outline: Client 1 (Samsung Austin Semiconductor) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                     | RedirectURL                                           | Page title |
      | https://stg.phs.com/sas       | https://stg.phs.com/content/phs/en/tph/sas.html       |            |
      | https://stg-myuhc.phs.com/sas | https://stg-myuhc.phs.com/content/phs/en/tph/sas.html |            |

  Scenario Outline: Client 2 (CSAA) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                      | RedirectURL                                            | Page title |
      | https://stg.phs.com/csaa       | https://stg.phs.com/content/phs/en/tph/csaa.html       |            |
      | https://stg-myuhc.phs.com/csaa | https://stg-myuhc.phs.com/content/phs/en/tph/csaa.html |            |

  Scenario Outline: Client 3 (Parsons Corporation) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                         | RedirectURL                                               | Page title |
      | https://stg.phs.com/parsons       | https://stg.phs.com/content/phs/en/tph/parsons.html       |            |
      | https://stg-myuhc.phs.com/parsons | https://stg-myuhc.phs.com/content/phs/en/tph/parsons.html |            |
     

      
      
      
      