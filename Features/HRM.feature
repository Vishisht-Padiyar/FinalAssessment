#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: HRM application, login, apply leave and search overloading

  @tag1
  Scenario: Verify user is able to login with valid user id and password
	Given browser is open and application is in login page
	When user enters user name and password

  @tag2
  Scenario: User is able to apply leave
    Given application is in home page
    When user enteres details and applies for leave
    Then Leave application is submitted
    
  @tag3
  Scenario: User is able to search employees using emp name and username
    Given application is in home page
    When user enteres username
    When user enteres username and employeename
