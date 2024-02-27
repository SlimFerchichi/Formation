package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.AchatValidationPanier;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AchatValidationPanierStepDef {
	
	WebDriver driver=SetUp.driver;
	//initialisation des pages objects
	AchatValidationPanier achat= new AchatValidationPanier(driver);

	@When("choisir un article")
	public void choisir_un_article() {
	    achat.choisir_un_article();
	    achat.ajout_article();;
	}

	@When("cliquer regarder panier")
	public void cliquer_regarder_panier() {
	    achat.view_article();
	}

	@When("cliquer sur check")
	public void cliquer_sur_check() {
	    achat.check_article();
	}

	@When("cliquer sur place order")
	public void cliquer_sur_place_order() {
		achat.payer_article();
	    
	}

	@When("remplir name of card {string}")
	public void remplir_name_of_card(String string) {
	    achat.name_card(string);
	}

	@When("remplir Card Number {string}")
	public void remplir_card_number(String string) {
	    achat.number_card(string);
	}

	@When("Remplir CVC {string} , Expiration {string} et Annee {string}")
	public void remplir_cvc_expiration_et_annee(String string, String string2, String string3) {
	    achat.CvC(string);
	    achat.exp_month(string2);
	    achat.exp_year(string3);
	}

	@When("cliquer sur Payer")
	public void cliquer_sur_payer() {
	    achat.confirm();
	}

	@Then("vérifier que le paiement est fait {string}")
	public void vérifier_que_le_paiement_est_fait(String string) {
	    
	}


}
