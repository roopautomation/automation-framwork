#Author: Mohammed.Gani100@optum.com
@Release0.0.1 @Sprint3
Feature: US608937_Welcome (WC is 'Overview') Component (D) - FE

Background:
 	Given Landing Page opens   
 	             
@Run	
Scenario: Add Section Header components to page
	When select the Welcome/Overview component
	Then they are able to drag and drop one component to the page
	And Button label displays "Complete"
	And drag and drop a second component to the page
	And drag and drop a third component to the page
	And drag and drop a fourth component to the page

Scenario: Edit content in Welcome/Overview component 
	Given an AEM content author needs to edit the headline and/or body copy of the component
	When she edits the headline and/or body copy
	And she publishes the edit
	And a user navigates to a page where a Welcome/Overview component is displayed
	Then the updated content is displayed correctly on the site

Scenario: Don't display body copy on site
	Given an AEM content author needs to delete the body copy in the component
	When she deletes the body copy in the component
	And she publishes the edit
	And a user navigates to a page where a Welcome/Overview component is displayed
	Then only the header text is displayed on the site
	And the padding around the component has adjusted so there is no extra white space on the page below the headline