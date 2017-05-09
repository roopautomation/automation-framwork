#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US407541 Link to Health Library
	
Background:
	Given Dashboard opens

@Run	
Scenario: Health Library is linked 
	Then Click Health Library link
	And URL loads correctly