#Author: Sukhwinder Singh
@stage  @test
Feature: US779161 STG URL Redirects - Fertility, Kidney, Maternity, and Transplant

  Scenario Outline: Fertility Solutions URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                      | RedirectURL                                                                | Page title          |
      | https://stg.phs.com/fertilitysolutions         | https://stg.phs.com/content/phs/en/phs/fertilitysolutions.html             | Fertility Solutions |
      | https://stg-myuhc.phs.com/fertilitysolutions   | https://stg-myuhc.phs.com/content/phs/en/phs/fertilitysolutions.html       | Fertility Solutions |
      | https://stg-myoptum.phs.com/fertilitysolutions | https://stg-myoptum.phs.com/content/optum/en/optum/fertilitysolutions.html | Fertility Solutions |
      | https://stg.phs.com/fertiLITYsolutions         | https://stg.phs.com/content/phs/en/phs/fertilitysolutions.html             | Fertility Solutions |
      | https://stg-myuhc.phs.com/FERTIlitysolutions   | https://stg-myuhc.phs.com/content/phs/en/phs/fertilitysolutions.html       | Fertility Solutions |
      | https://stg-myoptum.phs.com/fertilitySOLUTIONS | https://stg-myoptum.phs.com/content/optum/en/optum/fertilitysolutions.html | Fertility Solutions |

  Scenario Outline: Kidney Resource Services URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                                 | Page title               |
      | https://stg.phs.com/krs         | https://stg.phs.com/content/phs/en/phs/krs.html             | Kidney Resource Services |
      | https://stg-myuhc.phs.com/krs   | https://stg-myuhc.phs.com/content/phs/en/phs/krs.html       | Kidney Resource Services |
      | https://stg-myoptum.phs.com/krs | https://stg-myoptum.phs.com/content/optum/en/optum/krs.html | Kidney Resource Services |
      | https://stg.phs.com/KRS         | https://stg.phs.com/content/phs/en/phs/krs.html             | Kidney Resource Services |
      | https://stg-myuhc.phs.com/KRS   | https://stg-myuhc.phs.com/content/phs/en/phs/krs.html       | Kidney Resource Services |
      | https://stg-myoptum.phs.com/KRS | https://stg-myoptum.phs.com/content/optum/en/optum/krs.html | Kidney Resource Services |

  Scenario Outline: Transplant Resources Service URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                       | RedirectURL                                                 | Page title                   |
      | https://stg.phs.com/trs         | https://stg.phs.com/content/phs/en/phs/trs.html             | Transplant Resource Services |
      | https://stg-myuhc.phs.com/trs   | https://stg-myuhc.phs.com/content/phs/en/phs/trs.html       | Transplant Resource Services |
      | https://stg.phs.com/TRS         | https://stg.phs.com/content/phs/en/phs/trs.html             | Transplant Resource Services |
      | https://stg-myuhc.phs.com/TRS   | https://stg-myuhc.phs.com/content/phs/en/phs/trs.html       | Transplant Resource Services |
      | https://stg-myoptum.phs.com/trs | https://stg-myoptum.phs.com/content/optum/en/optum/trs.html | Transplant Resource Services |
      | https://stg-myoptum.phs.com/TRS | https://stg-myoptum.phs.com/content/optum/en/optum/trs.html | Transplant Resource Services |

  Scenario Outline: Maternity Support URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                    | RedirectURL                                                              | Page title        |
      | https://stg.phs.com/maternitysupport         | https://stg.phs.com/content/phs/en/phs/maternitysupport.html             | Maternity Support |
      | https://stg-myuhc.phs.com/maternitysupport   | https://stg-myuhc.phs.com/content/phs/en/phs/maternitysupport.html       | Maternity Support |
      | https://stg-myoptum.phs.com/maternitysupport | https://stg-myoptum.phs.com/content/optum/en/optum/maternitysupport.html | Maternity Support |
      | https://stg.phs.com/maternitySUPPORT         | https://stg.phs.com/content/phs/en/phs/maternitysupport.html             | Maternity Support |
      | https://stg-myuhc.phs.com/MATERnitysupport   | https://stg-myuhc.phs.com/content/phs/en/phs/maternitysupport.html       | Maternity Support |
      | https://stg-myoptum.phs.com/materNITYsupport | https://stg-myoptum.phs.com/content/optum/en/optum/maternitysupport.html | Maternity Support |

      
      
      
      
      