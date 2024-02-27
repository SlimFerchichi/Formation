package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AchatValidationPanier {
	WebDriver driver;
	
	//creation constructeur
	public AchatValidationPanier (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//identification des Elements
	
	@FindBy (how=How.CSS , using= "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public static WebElement article1;
	
	@FindBy (how=How.XPATH , using= "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]/a[1]")
	public static WebElement Add_article;
	
	@FindBy (how=How.XPATH , using="//u[normalize-space()='View Cart']")
	public static WebElement BT_View;
	
	@FindBy (how=How.XPATH , using="//a[normalize-space()='Proceed To Checkout']")
	public static WebElement BT_check;
	
	@FindBy (how=How.XPATH , using="//a[normalize-space()='Place Order']")
	public static WebElement BT_order;
	
	@FindBy (how=How.NAME , using="name_on_card")
	public static WebElement Name_card;
	
	@FindBy (how=How.NAME , using="card_number")
	public static WebElement Number_card;
	
	@FindBy (how=How.NAME , using="cvc")
	public static WebElement CVC;
	
	@FindBy (how=How.NAME , using="expiry_month")
	public static WebElement expiration_month;
	
	@FindBy (how=How.NAME , using="expiry_year")
	public static WebElement expiration_year;
	
	@FindBy (how=How.XPATH , using="//button[@id='submit']")
	public static WebElement Bt_Confirm_order;
	
	@FindBy(how=How.XPATH, using ="message_vente")
	public static WebElement message_vente;
	
	//Creation Methode
	
	public void choisir_un_article() {
		Actions action = new Actions(driver);
		action.moveToElement(article1);
	}
	
	public void ajout_article() {
		Add_article.click();
	}
	public void view_article() {
		BT_View.click();
	}
	public void check_article() {
		BT_check.click();
	}
	public void payer_article() {
		BT_order.click();
	}
	
	public void name_card(String text) {
	   Name_card.sendKeys(text);
    }
	public void number_card(String text) {
	  Number_card.sendKeys(text);
	}
	public void CvC(String text) {
		CVC.sendKeys(text);
	}
	public void exp_month(String text) {
		expiration_month.sendKeys(text);
	}
	public void exp_year(String text) {
		expiration_year.sendKeys(text);
	}
	public void confirm() {
		Bt_Confirm_order.click();
	}
	
	public static String resultat_obtenu() {
		String resultat_obtenu;
		resultat_obtenu= message_vente.getText();
		return resultat_obtenu;
	}
}
