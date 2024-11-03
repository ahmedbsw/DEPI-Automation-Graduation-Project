package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Pagebase {

	public Registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	WebElement firistnameElement;
	
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	WebElement lastnameElement;
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@name=\"telephone\"]")
	WebElement telephone;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//input[@name=\"confirm\"]")
	WebElement confirm;
	
	@FindBy(xpath = "(//input[@name=\"newsletter\"])[1]")
	WebElement radioElement;
	
	@FindBy(xpath = "//input[@name=\"agree\"]")
	WebElement privacyElement;
	
	@FindBy(xpath = "//input[@value=\"Continue\"]")
	WebElement continuesElement;
	
	@FindBy (xpath = "//*[@id=\"account-register\"]/div[1]")
	 public WebElement warningElement ;
	
	@FindBy(className = "text-danger")
	public WebElement errorconfirmElement ;
	@FindBy(linkText = "Continue")
	public WebElement continueloginElement ;
	
	@FindBy (xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/i")
	WebElement profilElement;
	
	@FindBy(xpath = "(//a[text () =\"Logout\"])[1]")
	public WebElement logoutElement ;
	
	@FindBy(xpath = "(//a[text () = \"Login\"])[2]")
	WebElement loginElement ;
	
	
	
	@FindBy(tagName = "h1")
	public WebElement successmessagElement ;
	
	public void usercanregister(String firiString , String lastnameString ,String emailString ,String telephoneString , String passwordString ,String confirmpasswordString ) {
		sendingvalue(firistnameElement, firiString);
		sendingvalue(lastnameElement, lastnameString);
		sendingvalue(emailElement, emailString);
		sendingvalue(telephone, telephoneString);
		sendingvalue(password, passwordString);
		sendingvalue(confirm, confirmpasswordString);
		clickbtn(radioElement);
		
	}
	
	public void continues() {
		clickbtn(continuesElement);

		
	}
	
	public void privacy() {
		clickbtn(privacyElement);

		
	}
	
	public void logout() {
		clickbtn(profilElement);
		clickbtn(logoutElement);
		
	}
	
	public void login() {
		clickbtn(loginElement);
		
	}
	
	
	public void continlogin() {
		
		clickbtn(continueloginElement);
		
	}	
	
	
	
	
	
	
	
	
	
	
	

}
