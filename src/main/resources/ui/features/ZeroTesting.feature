Feature: testing

  @test9
  Scenario Outline: Store Members Edited Phone Number and phone type
    Given User is on recommended page
    When The user has clicked the CTA to Request A Call
    Then User is on Contact info section
    When User click edit phone link
    And The user selects the phone number types as <PhoneType>
    And User enter phone number as <Number>
    #And Member enter new phone number like "<PhoneNumber>"
    And User click on Next button
    Then Preferred Time section displayed
    And The user selects their preferred call back time as "Mornings"
    And The user clicks the Next button
    Then Question section tab display
    And The member clicks the Finish button
    Then Confirmation page display

    Examples: 
      | PhoneType | Number     |
      | Home      | 3333484599 |

  Scenario: Verify data in detail page
    Given Confirmation page display
    When user click on show More link
    Then Detail page displayed
    And User verify Phone Type
    And User verify Phone Number
    And edit link for phone and phoneType displayed
    And User verify Preferred time selected
    And User verify Answer text
