
@PageConnexion
Feature: Connexion Compte Existant
  Je veux me connecter après avoir créé un compte

  @connexion
  Scenario: connexion compte homme
    Given saisir URL de site : "https://automationexercise.com/"
    When click to Signup_login
    And Inserer Adresse mail "testing@hotmail.fr"
    When Inserer mot de passe "cisco123"
    And Cliquer sur Login
    Then Vérification connexion compte "Logged in as Slim Slim"
    

  
  
  

   