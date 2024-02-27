package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageConnexion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ConnexionCompteStepDef {
	
	WebDriver driver= SetUp.driver;
	
	//initialisation des pages objects
	PageConnexion connect= new PageConnexion(driver);
	
	
	@When("Inserer Adresse mail {string}")
	public void inserer_adresse_mail(String string) {
		connect.saisir_mail_adress(string);
	    
	}

	@When("Inserer mot de passe {string}")
	public void inserer_mot_de_passe(String string) {
		connect.saisir_PASSWORD(string);
	    
	}

	@When("Cliquer sur Login")
	public void cliquer_sur_login() {
		connect.click_BT_Login();
	    
	}

	@Then("Vérification connexion compte {string}")
	public void vérification_connexion_compte(String string) {
		Assert.assertEquals(connect.verification_account(),string);
		
	   
	}

}
