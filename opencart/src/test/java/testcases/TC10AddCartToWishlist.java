package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Wishlistpage;

public class TC10AddCartToWishlist extends Testbase {
	Homepage homeobject;
	Loginpage loginpageobject;
	Wishlistpage wishlistobject;

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

		loginpageobject.clicklogo();
	}

	@Test(priority = 6)
	public void addwishlist() {
		wishlistobject = new Wishlistpage(driver);
		wishlistobject.clickwishlist();

	}

	@Test(priority = 7)
	public void assertsuccess() {
		wishlistobject = new Wishlistpage(driver);
		assertEquals(wishlistobject.alertmessagElement.getText(), "Wish List (1)");
		

	}

}
