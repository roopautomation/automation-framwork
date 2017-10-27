
Feature: Lead promotion To Get Program Referrals

Scenario Outline: Call LeadPromotion Service For Referral Programs

Given a user has authenticated to the PHS portal with their HSID as "<hsid>"
When ICUE has determined <member> is not enrolled in any programs they are eligible for
Then API is triggered to <getReferralPrograms> for <member>
And the appropriate <referral program(s)> are returned

Examples: 
|hsid|
||

Scenario Outline: Send Error Message If Not Found
Given a user has authenticated to the PHS portal with their HSID as "<HDID>"
When ICUE has determined <member> is not enrolled in any programs they are eligible for
And API is triggered to <getReferralPrograms> for <member>
And it is determined that there are no appropriate programs for the <member>
Then an error message is returned

Examples: 
|hsid|
||