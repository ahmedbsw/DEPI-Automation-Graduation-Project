package testcases;

import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;

public class TC06SuccessLogin extends Testbase {
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
		loginpageobject.login("ahmed21@g.com", "1234567");
	}

}
