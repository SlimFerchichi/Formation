@PageCreation
Feature: Creation compte
  je veux creer un compte en tant que utilisateur

  @creation
  Scenario: creation compte homme
    Given saisir URL de site : "https://automationexercise.com/"
    When click to Signup_login
    And whrite Name "Slim Slim"
    And Whrite mail "testing@hotmail.fr"
    And Click to the buton signup
    Then Vérification information account
    When fill title
    And fill password "cisco123"
    And fill date of birth "19" , "3" et "1990"
    And Select checkbox Sign up newsletter
    And Select checkbox Receive special offers partners
    And fill First name : "test", Last name : "ben test", Company : "test", Address : "tastour", Address2 : "takelssa"
    And fill again Country : "Canada" , State : "canada" , City : "canada", Zipcode : "2006" , Mobile Number : "123456789"
    And click Create Account button
    Then Verify that "ACCOUNT CREATED!" is visible




   
   