package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Pagebase {

	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	public WebElement emailadressElement;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement loginpasswordElement ;
	
	@FindBy(xpath = "//input[@value=\"Login\"]")
	public WebElement Loginpage;
	
	@FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
	public WebElement forgetpasswordElement;
	
	@FindBy(className = "img-responsive")
	 WebElement homelogo ;
	@FindBy(className = ".alert-danger")
	public WebElement errormessage ;
	
	public void login(String emailString , String passwordString ) {
		sendingvalue(emailadressElement, emailString);
		sendingvalue(loginpasswordElement, passwordString);
		clickbtn(Loginpage);
		
	}
	
	public void clicklogo() {
		clickbtn(homelogo);
		
	}
	
	
	
	
	

}
