 @Regression
Feature: Sign in with social accounts 

Background: 
	Given the user is on the home page 
	When the user clicks on the SIGN IN link 
	
@Facebook
Scenario: Sign in with Facebook account 
	Then the Sign in with Facebook account option should be available 
	
@Google
Scenario: Sign in with Google account 
	Then the Sign in with Google account option should be available	