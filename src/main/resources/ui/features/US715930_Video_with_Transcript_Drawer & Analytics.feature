# Author: Sukhwinder Singh
@sprint31
Feature: Video with Transcript Drawer & Analytics

  Scenario: Video component without content in Transcrip
    Given User is on PHS page.
    When User scroll to video component
    Then Video component dispayed
    And ViewTranscript not display If No cotent is entered in Transcript
    And If time and videoName display, a verticle bar is display

  Scenario: Video copmonent with content in transcript.
    Given User is on PHS page.
    When User scroll to video component
    Given View transcript link displayed.
    When User click on view Transcript link
    Then Print transcript link displayed
    And A drawer is open
    And A cross sign displaye to close drawer
    And A scroll bar present in drawer
    When User click on cross sign button
    Then Drawer get closed
