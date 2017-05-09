#Author: heather.newby@optum.com
@Release0.0.1 @Sprint2
Feature: US407578 Link to survey
	
Background:
	Given Dashboard opens

@Run	
Scenario: Survey is linked 
	Then Click survey link
	And Survey loaded correctly