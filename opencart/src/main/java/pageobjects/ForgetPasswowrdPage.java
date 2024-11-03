package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswowrdPage extends Homepage {

	public ForgetPasswowrdPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Forgotten Password']")
	WebElement fpwd;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement con_tinue;
	
	@FindBy (className = "alert")
	public WebElement messageelement ;
	
	public void forget(String emailString) {
		clickbtn(fpwd);
		sendingvalue(email, emailString);
		clickbtn(con_tinue);
		
		
		
	}
	
	
	

}
