#Author: Sukhwinder Singh

Feature: STG URL Redirects for: Cancer, Fertility, Kidney, Maternity, TRS, SJS

  Scenario Outline: Cancer Resource Service URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                               | RedirectURL                                                     | Page title       |
      | https://phs.com/cancersolutions         | https://phs.com/content/phs/en/phs/cancersolutions.html         | Cancer Solutions |
      | https://myuhc.phs.com/cancersolutions   | https://myuhc.phs.com/content/phs/en/phs/cancersolutions.html   | Cancer Solutions |
      | https://myoptum.phs.com/cancersolutions | https://myoptum.phs.com/content/phs/en/phs/cancersolutions.html | Cancer Solutions |

  Scenario Outline: Fertility Solutions URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                  | RedirectURL                                                        | Page title          |
      | https://phs.com/fertilitysolutions         | https://phs.com/content/phs/en/phs/fertilitysolutions.html         | Fertility Solutions |
      | https://myuhc.phs.com/fertilitysolutions   | https://myuhc.phs.com/content/phs/en/phs/fertilitysolutions.html   | Fertility Solutions |
      | https://myoptum.phs.com/fertilitysolutions | https://myoptum.phs.com/content/phs/en/phs/fertilitysolutions.html | Fertility Solutions |

  Scenario Outline: Kidney Resource Services URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                   | RedirectURL                                         | Page title               |
      | https://phs.com/krs         | https://phs.com/content/phs/en/phs/krs.html         | Kidney Resource Services |
      | https://myuhc.phs.com/krs   | https://myuhc.phs.com/content/phs/en/phs/krs.html   | Kidney Resource Services |
      | https://myoptum.phs.com/krs | https://myoptum.phs.com/content/phs/en/phs/krs.html | Kidney Resource Services |

  Scenario Outline: Transplant Resources Service URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                 | RedirectURL                                       | Page title                   |
      | https://phs.com/trs       | https://phs.com/content/phs/en/phs/trs.html       | Transplant Resource Services |
      | https://myuhc.phs.com/trs | https://myuhc.phs.com/content/phs/en/phs/trs.html | Transplant Resource Services |

  Scenario Outline: Maternity Support URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                                | RedirectURL                                                      | Page title        |
      | https://phs.com/maternitysupport         | https://phs.com/content/phs/en/phs/maternitysupport.html         | Maternity Support |
      | https://myuhc.phs.com/maternitysupport   | https://myuhc.phs.com/content/phs/en/phs/maternitysupport.html   | Maternity Support |
      | https://myoptum.phs.com/maternitysupport | https://myoptum.phs.com/content/phs/en/phs/maternitysupport.html | Maternity Support |

  Scenario Outline: Spine and Joint Solution (sjs) URLs redirect
    Given User open browser
    When User enter stage URL as "<Stage URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | Stage URL                   | RedirectURL                                         | Page title               |
      | https://phs.com/sjs         | https://phs.com/content/phs/en/phs/sjs.html         | Spine and Joint Solution |
      | https://myuhc.phs.com/sjs   | https://myuhc.phs.com/content/phs/en/phs/sjs.html   | Spine and Joint Solution |
      | https://myoptum.phs.com/sjs | https://myoptum.phs.com/content/phs/en/phs/sjs.html | Spine and Joint Solution |
