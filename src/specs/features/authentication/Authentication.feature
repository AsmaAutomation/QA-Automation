@connexion
Feature: Authentification - OrangeHRM
	En tant que utilisateur je souhaite m'authentifier 

  @cnx
  Scenario: Authentification - OrangeHRM
    Given Je me connecte à l application orangeHTML
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers le compte admin
