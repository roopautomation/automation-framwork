Feature: Hero Component

  Scenario: View Hero Section content on desktop browser
    Given the site visitor is accessing the site in a desktop browser
    When they navigate directly to the Unauthenticated Homepage
    Then the Hero image is displayed
    And the appropriate Header and Body copy is displayed
    And the appropriate Calls to Action are displayed
