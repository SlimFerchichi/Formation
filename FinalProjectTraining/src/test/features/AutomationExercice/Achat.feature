
@ValidationPanier
Feature: Connexion et validation panier
  Je veux me connecter après avoir créé un compte et valider mon panier

  @Achat
  Scenario: Achat et validation
    Given saisir URL de site : "https://automationexercise.com/"
    When click to Signup_login
    And Inserer Adresse mail "testing@hotmail.fr"
    When Inserer mot de passe "cisco123"
    And Cliquer sur Login
    Then Vérification connexion compte "Logged in as Slim Slim"
    When choisir un article
    And cliquer regarder panier
    And cliquer sur check 
    And cliquer sur place order
    And remplir name of card
    And remplir Card Number
    And Remplir CVC "555" , Expiration "12" et Annee "2030"
    And cliquer sur Payer
    Then vérifier que le paiement est fait "ORDER PLACED!"

  
