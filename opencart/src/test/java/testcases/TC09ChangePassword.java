package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobjects.ChangePasswordpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Registerpage;

public class TC09ChangePassword extends Testbase {
	Homepage homeobject ;
	Registerpage registerpage;
	Loginpage loginpageobject;
	ChangePasswordpage changeobjectChangePasswordpage;
	
	
	
	@Test(priority=1)
	public void userRegister() {
		homeobject = new Homepage(driver);
		homeobject.clickProfile();
		homeobject.Register();
		
		
		
		
	}
	
	
	@Test (priority = 2)
	public void userregistiration () {
		registerpage = new Registerpage(driver);
		
		registerpage.usercanregister(firistString, lString, "ahmed23212@g.com", telphon, password, confirm);
		registerpage.privacy();
		registerpage.continues();
		assertEquals(registerpage.successmessagElement.getText(), "Your Account Has Been Created!");
		registerpage.continlogin();
		
		
		
	}
	@Test(priority = 3)
	public void chamge () {
		changeobjectChangePasswordpage = new ChangePasswordpage(driver);
		changeobjectChangePasswordpage.changepassword("1234567");
	}
@Test(priority = 4)
	
	public void assertmessage() {
	changeobjectChangePasswordpage = new ChangePasswordpage(driver);

		assertEquals(changeobjectChangePasswordpage.messageelement.getText(), "Success: Your password has been successfully updated.");

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
