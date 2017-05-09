#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US407570 Section with boxes to help visualize the member experience
	
Background:
	Given Dashboard opens

@Run	
Scenario: Verify contact boxes display correctly
	Then User sees three contact containers
	And User sees "Talk" header
	And User sees static content
	And container is AEM authorable
	And User sees "Call" header
	And User sees static content
	And container is AEM authorable
	And User sees "Click" header
	And User clicks URL
	Then User is taken to myuhc.com