#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US407529 Ability to add a checkmark to health opportunity
	
Background:
	Given Dashboard opens

@Run	
Scenario: Adding checkmark to opportunity 
	Then Click "Marked as Complete"
	And Button label displays "Complete"
	And sidebar opportunity displays green checkmark