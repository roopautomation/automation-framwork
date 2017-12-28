Feature: testing

  @test9
  Scenario Outline: Client 3 (Parsons Corporation) URLs redirect
    Given User open browser
    When User enter stage URL as "<PROD URL>"
    Then User verify title as "<Page title>"
    And Redirect URL is as "<RedirectURL>"

    Examples: 
      | PROD URL                      | RedirectURL                                           | Page title |
      | https://phs.com/parsons       | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://phs.com/PARSONS       | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://myuhc.phs.com/parsons | https://myuhc.phs.com/content/phs/en/tph/parsons.html |            |
      | https://www.phs.com/PARSONS   | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://www.phs.com/parsons   | https://www.phs.com/content/phs/en/tph/parsons.html   |            |
      | https://myuhc.phs.COM/parsons | https://myuhc.phs.com/content/phs/en/tph/parsons.html |            |

