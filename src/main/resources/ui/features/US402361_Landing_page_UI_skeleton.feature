#Author: heather.newby@optum.com
@Release0.0.1 @Sprint1
Feature: US402361 Landing Page UI Skeleton
	
Background:
	Given Landing Page opens

@Run	@Regression
Scenario: Landing Page UI Skeleton displays correctly
	Then user sees a Landing banner 
	And user sees a component overlaying the Landing banner that contains text
	And user sees a video section with a discription text on the left side
	And user sees a video preview image in right side of video section
	And user sees information tiles and content
	And user sees additional registration and login section
	And user sees footer section

@Ignore @Regression
Scenario: Video enables correctly on Landing page
	When user clicks video preview image video activates
	Then video activates