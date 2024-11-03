package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	

	@FindBy (xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/i")
	WebElement profilElement;
	@FindBy(linkText = "Register")
	WebElement registerbtnElement;
	
	@FindBy(linkText = "Login")
	WebElement loginbtnElement;
	
	
	public void clickProfile() {
		clickbtn(profilElement);
		
	}
	
	public void Register() {
		clickbtn(registerbtnElement);
		
	}
	public void login() {
		clickbtn(loginbtnElement);
		
	}

}
