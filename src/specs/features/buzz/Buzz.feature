@buzz
Feature: Buzz - OrangeHRM
  En tant qu'utilisateur je veux exprimer what is in my mind

  Background: 
    Given Je me connecte à l application orangeHTML
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers le compte admin "Welcome"

  @buzz
  Scenario: Buzz - OrangeHRM
   When Je click sur le bouton buzz
   And Je saisie un message "Message test"
   And Je click sur le bouton post
   Then Je vérifie le message "Message test"
