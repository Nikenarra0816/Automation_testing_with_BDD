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
Feature: Type of DnD Document

  @test
  Scenario Outline: Add data empty type of DnD Document
    Given I login type of DnD Document username <username> and password <password>
    When I add new data empty type of DnD Document
    Then I click button save empty type of DnD Document
    
    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    