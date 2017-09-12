#Author: Sukhwinder Singh
Feature: Author Recommended for You page

  Scenario: Landing Page Functionality Testing
    Given User is on PHS page.
    #When User login with his credentials of HSID
    Then Authenticated landing page displayed
    And Tabs like Header,ProgramName, UserName, Tracker CTC and Request call button display
    When User click on Request call button
    Then Preferred Time section displayed
    And First circle of tracker is checked

  Scenario: Preferred Time section Functionality Testing
    Given User is on Preferred time page
    And Landing page tab Header,ProgramName, UserName, Tracker display
    And CallBackDetail,displayed and AnyTime is default selected
    When User select different time
    Then AnyTime option is unchecked
    When User select all three times and uncheck any one
    Then Remaining stay selected
    When User click CTA button
    Then The Tracker updates to show progression
    And Contact info section displayed

  Scenario: Contact Info Section Functionality Testing with valid data
    Given User is on Contact info section
    And Landing page tab Header,ProgramName, UserName, Tracker display
    And User Email and phone Display
    When User click on Edit button
    Then Phone field and dropdown field displayed
    And default phone type displayed
    When User edit Phone and phone type from dropdown
    And User click on Next button
    Then Question section tab display
    And Tracker status updated

  Scenario: Question Section Functionality Testing with valid data
    Given user is on Question page
    And Landing page tab Header,ProgramName, UserName, Tracker display
    And SectionHeader and Description field displayed
    When User enter text in all text fields and click on Finish button
    Then Confirmation page display

  Scenario: Testing without entering optional data
    Given User is on PHS page.
    #When User login with his credentials of HSID
    Then Authenticated landing page displayed
    And Tabs like Header,ProgramName, UserName, Tracker CTC and Request call button display
    When User click on Request call button
    Then Preferred Time section displayed
    When User click CTA button
    Then The Tracker updates to show progression
    And Contact info section displayed
    And User click on Next button
    Then Question section tab display
    When User click on Finish button
    Then Confirmation page display

  Scenario: Testing with invalid data
    Given User is on PHS page.
    #When User login with his credentials of HSID
    Then Authenticated landing page displayed
    And Tabs like Header,ProgramName, UserName, Tracker CTC and Request call button display
    When User click on Request call button
    Then Preferred Time section displayed
    When User click CTA button
    And Contact info section displayed
    When User click on Edit button
    And enter invalid phone number
    Then Error message displayed
