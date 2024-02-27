package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageConnexion {
	WebDriver driver;
	
	//creation de constructeur
			public PageConnexion (WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver,this);
}
	//identification des elements
		@FindBy(how = How.XPATH , using = "//input[@data-qa='login-email']")	
			public static WebElement mail_adress;
		
		@FindBy(how =How.XPATH , using="//input[@placeholder='Password']" )
		    public static WebElement PASSWORD;
		
		@FindBy(how=How.XPATH, using ="//button[normalize-space()='Login']")
		public static WebElement BT_Login;
		
		@FindBy(how=How.XPATH, using ="//li[10]//a[1]")
		public static WebElement Compte_created;
			
		//creation methode
		
		public void saisir_mail_adress(String text) {
			mail_adress.sendKeys(text);
		}
		
		public void saisir_PASSWORD(String text) {
			PASSWORD.sendKeys(text);
		}
		
		
		public void click_BT_Login() {
			BT_Login.click();
		}
		
		public static String verification_account() {
			String resultat_obtenu;
			resultat_obtenu= Compte_created.getText();
			return resultat_obtenu;
			
		}
		
}
