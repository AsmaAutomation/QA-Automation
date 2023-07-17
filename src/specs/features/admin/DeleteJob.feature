@job
Feature: Job - Scenarios

  Background: 
    Given Je me connecte à l application orangeHTML
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers le compte admin "Welcome"

  @deleteJob
  Scenario: Buzz - OrangeHRM
    When I click on Job Title
    And I select job titles "Database Administrator"
    And I click on delete button
    And I accept the delete
    Then a success message is displayed "Successfully Deleted"
    
