@ora 
Feature: Oracle live sql and Database validation

Background:
	Given User is logged into LiveSql
	And User navigates to sqlWorksheet

Scenario Outline: Query results must match
	When User runs "<sql>" on ui
	And User runs "<sql>" against database
	Then Results must match
	Examples:
	
	|               sql                                   |
	|select count(*) from hr.countries                    |
	|select max(salary) from hr.employees group by job_id |
	|select * from hr.departments                  |
	|select employee_id,TO_CHAR(hire_date) from hr.employees|
	

	
Scenario Outline: Job title and salary verification
	When User runs "SELECT job_id, salary FROM hr.employees where first_name='<first_name>' AND last_name='<last_name>'" on ui
	And User runs "SELECT job_id, salary FROM hr.employees where first_name='<first_name>' AND last_name='<last_name>'" against database
	Then Job title and salary should match "<job_id>" and <salary>
	Examples:
	|first_name|last_name|job_id  |salary|
	|Steven    |King     |AD_PRES |24000 |
	|Sigal     |Tobias   |PU_CLERK|2800  |
		
@pre-ora	
Scenario: Department members verificaion
	When User runs "Select employee_id from hr.employees where department_id=100" on ui
	And User runs "Select employee_id from hr.employees where department_id=100" against database
	Then Following employee ids should be present:
		|108|
		|109|
		|110|
		|111|
		|112|
		|113|
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	