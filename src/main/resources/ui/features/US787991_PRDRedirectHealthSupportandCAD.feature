#Author: Sukhwinder Singh
@prod
Feature: US787991 PRD Redirect Health Support and CAD

  Scenario Outline: CAD URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                    | RedirectURL                                             | Page title              |
      | https://phs.com/cad         | https://www.phs.com/content/phs/en/phs/cad.html         | Coronary Artery Disease |
      | https://www.phs.com/cad     | https://www.phs.com/content/phs/en/phs/cad.html         | Coronary Artery Disease |
      | https://www.phs.com/CAD     | https://www.phs.com/content/phs/en/phs/cad.html         | Coronary Artery Disease |
      | https://myuhc.phs.com/cad   | https://myuhc.phs.com/content/phs/en/phs/cad.html       | Coronary Artery Disease |
      | https://phs.com/CAD         | https://www.phs.com/content/phs/en/phs/cad.html         | Coronary Artery Disease |
      | https://myuhc.phs.com/CAD   | https://myuhc.phs.com/content/phs/en/phs/cad.html       | Coronary Artery Disease |
      | https://myoptum.phs.com/cad | https://myoptum.phs.com/content/optum/en/optum/cad.html | Coronary Artery Disease |
      | https://myoptum.phs.com/CAD | https://myoptum.phs.com/content/optum/en/optum/cad.html | Coronary Artery Disease |

  Scenario Outline: Health Support URLs redirect
    Given User open browser
    When User enter prod URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                | RedirectURL                                         | Page title     |
      | https://phs.com         | https://www.phs.com/content/phs/en/phs.html         | Health Support |
      | https://myuhc.phs.com   | https://myuhc.phs.com/content/phs/en/phs.html       | Health Support |
      | https://www.phs.com     | https://www.phs.com/content/phs/en/phs.html         | Health Support |
      | https://www.PHS.com     | https://www.phs.com/content/phs/en/phs.html         | Health Support |
      | https://phs.COM         | https://www.phs.com/content/phs/en/phs.html         | Health Support |
      | https://myuhc.PHS.com   | https://myuhc.phs.com/content/phs/en/phs.html       | Health Support |
      | https://myoptum.phs.com | https://myoptum.phs.com/content/optum/en/optum.html | Health Support |
      | https://MYOPTUM.phs.com | https://myoptum.phs.com/content/optum/en/optum.html | Health Support |
