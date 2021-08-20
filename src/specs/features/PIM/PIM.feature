@employe
Feature: Add employee
  Je veux ajouter un employé à la liste
  
  Background: 
    Given Je me connecte à l application orangeHTML
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers le compte admin "Welcome"

   @employee
  Scenario: Ajouter un employé
    When Je clique sur PIM
    And JE Clique sur add employee
    And Je saisie First name "Marcellaa" and last name "Mexico"
    And J'importe une photo "D:\\Formation Selenium\\Projects\\test.jfif"
    And Je clique sur create login
    And Je saisie user name "MarcellaK" and password "Marcela12345@" and confirm password "Marcela12345@"
    And Je select status Enabled "Disabled"
    And Je clique sur Save
    Then Je vérifie que l'employé est ajouté
    
    @updateEmployee
    Scenario: modifier un employé
    When Je clique sur PIM
    And Je filtre par id "0000000"
    And Je clique sur rechercher
    And J'accède au profile de l'employee
    And Je clique sur edit
    And Je saisie le numéro de perims de conduite "123456789"
    And Je choisis la date d'expiration ""
    And Je choisie la situation familiale
    And Je clique sur save
    Then le message de succès s'affiche ""
    