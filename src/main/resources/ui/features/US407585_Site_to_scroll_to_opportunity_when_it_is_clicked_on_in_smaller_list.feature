#Author: heather.newby@optum.com
@Release0.0.1 @Sprint2
Feature: US407585 Site to scroll to opportunity when it is clicked on in smaller list
	
Background:
	Given Dashboard opens

@Run	
Scenario: Clicking small opportunity list item scrolls page to large opportunity 
	Then Click small opportunity item
	And page scrolls
	And large opportunity displays