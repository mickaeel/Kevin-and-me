 @SmokeTest @Regression
 Feature: positive login functionality 

 @login_host 
 Scenario: Login as a host 
	Given I am on the fourstay homepage 
	When I login as a host 
	Then I should be able to verify that I logged in 
	# this is how you comment
	
 Scenario: Login as a guest 
	Given I am on the fourstay homepage 
	When I login as guest 
	Then I should be able to verify that I logged in 
