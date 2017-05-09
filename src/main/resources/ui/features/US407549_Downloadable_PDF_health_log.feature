#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US407549 Downloadable PDF health log
	
Background:
	Given Dashboard opens

@Run	
Scenario: PDF Health log can be downloaded 
	Then Click Health log link
	And URL loads correctly
	And URL loads in new window