@tag
Feature: User management

  @tag1
  Scenario: Add new user
    Given i am on Homepage
    When i add new user
    And i fill user role field "Admin"
    And i fill  emloyee name "Asma"
    And i fill username  "Asma"
    And i fill status field "Enabled"
    And i fill password field "Asma123"
    And i fill confirm password field "Asma123"
    Then i save the informations
    And check more outcomes
    
      @tag2
  Scenario: Search user
    Given I m on HomePage
    When I fill username "Alice.Duval"
    Then I find the user seached

