@cnxoutline
Feature: Authentification outline - OrangeHRM
  En tant que utilisateur je veux connecter à l'application OrangeHRM avec un scénario outline

  @cnxoutline
  Scenario Outline: Authentification outline - OrangeHRM
    Given Je me connecte à l application orangeHTML
    When Je saisie login "<login>"
    And Je saisie password "<password>"

    Examples: 
      | login   | password   |
      | Admin   | Admin123   |
      | Asma    | asma123    |
      | Nesrine | nesrine123 |
