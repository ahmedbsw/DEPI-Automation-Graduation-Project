package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;

public class TC11LoginWithInvalidEmail extends Testbase {
	Homepage homeobject;
	Loginpage loginpageobject;

	@Test(priority = 1)
	public void userRegister() {
		homeobject = new Homepage(driver);
		homeobject.clickProfile();
		homeobject.login();

	}

	@Test(priority = 5)
	public void login() {
		loginpageobject = new Loginpage(driver);
		loginpageobject.login("xubos@mailinator.com", "0000000000");
	}
	public void asserterrormsg() {
		loginpageobject = new Loginpage(driver);
		assertEquals(loginpageobject.errormessage.getText(), "Warning: No match for E-Mail Address and/or Password.");

		
	}

}
