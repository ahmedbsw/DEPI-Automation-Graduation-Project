package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordpage extends Pagebase {

	public ChangePasswordpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='Change your password']")
	WebElement changepwd;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement beforepwd;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement pwdconfm;
	
	@FindBy(xpath="//a[text()='Back']")
	WebElement backhomepage;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement contin;
	
	@FindBy (className = "alert")
	public WebElement messageelement ;
	
	
	public void changepassword(String passwordString) {
		clickbtn(changepwd);
		sendingvalue(beforepwd, passwordString);
		sendingvalue(pwdconfm, passwordString);
		clickbtn(contin);

		
		
		
	}
	

}
