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
Feature: Department

  @test
  Scenario Outline: Add data empty department
    Given I login department username <username> and password <password>
    When I add new data empty department
    Then I click button save empty departement

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Cancel add data departement
    Given I login department username <username> and password <password>
    When I click add data departement
    Then I click button cancel departement

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Add data new department
    Given I login department username <username> and password <password>
    When I add new data departement
    Then I click button save departement

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Add data registered department
    Given I login department username <username> and password <password>
    When I add data registered departement
    Then I click button save registered departement

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
 
 Scenario Outline: Edit data department
    Given I login department username <username> and password <password>
    When I click button edit and edit data department
    Then I click button save edit department

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
 
  
      