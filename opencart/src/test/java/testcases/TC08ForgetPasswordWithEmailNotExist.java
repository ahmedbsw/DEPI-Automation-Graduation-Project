package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobjects.ForgetPasswowrdPage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Registerpage;

public class TC08ForgetPasswordWithEmailNotExist extends Testbase {
	Homepage homeobject;
	Registerpage registerpage;
	Loginpage loginpageobject;
	ForgetPasswowrdPage forgetobjectForgetPasswowrdPage;

	@Test(priority = 1)
	public void userRegister() {
		homeobject = new Homepage(driver);
		homeobject.clickProfile();
		homeobject.Register();

	}

	@Test(priority = 2)
	public void userregistiration() {
		registerpage = new Registerpage(driver);

		registerpage.usercanregister(firistString, lString, validemailString, telphon, password, confirm);
		registerpage.privacy();
		registerpage.continues();
		assertEquals(registerpage.successmessagElement.getText(), "Your Account Has Been Created!");
		registerpage.continlogin();

	}

	@Test(priority = 3)
	public void logout() {
		registerpage = new Registerpage(driver);
		registerpage.logout();
		assertEquals(registerpage.successmessagElement.getText(), "Account Logout");

	}

	@Test(priority = 4)
	public void loginbtn() {
		registerpage = new Registerpage(driver);
		registerpage.login();

	}
	
	@Test(priority = 5)
	public void forget () {
		forgetobjectForgetPasswowrdPage = new ForgetPasswowrdPage(driver);
		forgetobjectForgetPasswowrdPage.forget(emailnotexist);
		
		
	}
@Test(priority = 6)
	
	public void assertmessage() {
	forgetobjectForgetPasswowrdPage = new ForgetPasswowrdPage(driver);

		assertEquals(forgetobjectForgetPasswowrdPage.messageelement.getText(), "Warning: The E-Mail Address was not found in our records, please try again!");

	}

}
