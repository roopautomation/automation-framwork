#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US407531 No un-checking checked opportunities
	
Background:
	Given Dashboard opens

@Run	
Scenario: User cannot uncheck a checked opportunity 
	Then Click "Complete"
	And Button label displays "Complete"
	And sidebar opportunity displays green checkmark