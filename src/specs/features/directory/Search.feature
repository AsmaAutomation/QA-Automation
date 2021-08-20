@directory
Feature: Directory features

  Background: 
    Given Je me connecte à l application orangeHTML
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers le compte admin "Welcome"
    
  @search
  Scenario: Search a directory

    When I navigate to directory interface
    And Fill the name field "Lisa"
    And Click on search button
    Then The searched directory is displayed "Lisa"

