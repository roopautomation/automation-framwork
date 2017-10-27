Feature: testing
@test9
  Scenario Outline: Store Members Edited Phone Number and phone type
    Given User is on recommended page
    When The user has clicked the CTA to Request A Call
    Then User is on Contact info section
    When User click edit phone link
    And The user selects the phone number types as "<PhoneType>"
    And User enter phone number as "<PhoneNumber>"
    And User click on Next button

    Examples: 
      | PhoneType | PhoneNumber |
      | Work      |  1777777777 |
