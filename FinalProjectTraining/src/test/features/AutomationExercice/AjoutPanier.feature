
@Panier
Feature: validation panier
 
 Background: 
 		Given saisir URL de site : "https://automationexercise.com/"
    When click to Signup_login
    And Inserer Adresse mail "testing@hotmail.fr"
    When Inserer mot de passe "cisco123"
    And Cliquer sur Login
    Then Vérification connexion compte "Logged in as Slim Slim"

  @Achat
  Scenario: Achat
    When choisir un article
    And cliquer regarder panier
    And cliquer sur check 
    And cliquer sur place order
    And remplir name of card "slim slim"
    And remplir Card Number "5654 8952 9561 1452"
    And Remplir CVC "555" , Expiration "12" et Annee "2030"
    And cliquer sur Payer
    Then vérifier que le paiement est fait "ORDER PLACED!"

  
