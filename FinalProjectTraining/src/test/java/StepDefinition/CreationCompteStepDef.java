package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageAcceuil;
import PageObject.PageFormulaire;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreationCompteStepDef {
	
	WebDriver driver = SetUp.driver;
			
	//initialisation des pages objects
	 PageAcceuil acceuil = new  PageAcceuil(driver);
	 PageFormulaire formule = new PageFormulaire(driver);
	 
	
	
	@Given("saisir URL de site : {string}")
	public void saisir_url_de_site(String string) {
	   acceuil.saisieURL(string);
	}

	@When("click to Signup_login")
	public void click_to_signup_login() {
		acceuil.cliqueBT_signup1();
	  
	}

	@When("whrite Name {string}")
	public void whrite_name(String string) {
		acceuil.creerName(string);
	    
	}

	@When("Whrite mail {string}")
	public void whrite_mail(String string) {
		acceuil.crrermail(string);
	 
	}

	@When("Click to the buton signup")
	public void click_to_the_buton_signup() {
		acceuil.cliquerBt_signup2();
	   
	}

	@Then("Vérification information account")
	public void vérification_information_account() {
	   
	}

	@When("fill title")
	public void fill_title() {
	   formule.cliquer_BT_title();
	}

	@When("fill password {string}")
	public void fill_password(String string) {
	   formule.saisir_Pass(string);
	}

	@When("fill date of birth {string} , {string} et {string}")
	public void fill_date_of_birth(String string1,String string2,String string3) {
	    formule.select_day(string1);
	    formule.select_Month(string2);
	    formule.select_Year(string3);
	}

	@When("Select checkbox Sign up newsletter")
	public void select_checkbox_sign_up_newsletter() {
	    formule.cliquer_newsletter();
	}

	@When("Select checkbox Receive special offers partners")
	public void select_checkbox_receive_special_offers_partners() {
	    formule.cliquer_Offer();
	}

	@When("fill First name : {string}, Last name : {string}, Company : {string}, Address : {string}, Address2 : {string}")
	public void fill_first_name_last_name_company_address_address2(String string, String string2, String string3, String string4, String string5) {
	    formule.saisir_First_Name(string);
	    formule.saisir_Last_Name(string2);
	    formule.saisir_company(string3);
	    formule.saisir_Adress1(string4);
	    formule.saisir_Adress2(string5);
	}

	@When("fill again Country : {string} , State : {string} , City : {string}, Zipcode : {string} , Mobile Number : {string}")
	public void fill_again_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5) {
	    formule.select_Country(string);
	    formule.saisirState(string2);
	    formule.saisircity(string3);
	    formule.saisirZipcode(string4);
	    formule.saisirMobile(string5);
	}

	@When("click Create Account button")
	public void click_create_account_button() {
	    formule.cliquer_create_button();
	}

	@Then("Verify that {string} is visible")
	public void verify_that_account_created_is_visible(String string) {
	    Assert.assertTrue(formule.resultat_obtenu().contains(string));
	}

}
