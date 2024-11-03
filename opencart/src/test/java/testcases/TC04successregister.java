package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Registerpage;

public class TC04successregister extends Testbase {
	Homepage homeobject ;

	Registerpage registerpage;
	
	
	@Test(priority=1)
	public void userRegister() {
		homeobject = new Homepage(driver);
		homeobject.clickProfile();
		homeobject.Register();
		
		
		
		
	}
	
	
	@Test (priority = 2)
	public void userregistiration () {
		registerpage = new Registerpage(driver);
		
		registerpage.usercanregister(firistString, lString, validemailString, telphon, password, password);
		registerpage.privacy();
		registerpage.continues();
		assertEquals(registerpage.successmessagElement.getText(), "Your Account Has Been Created!");
		
		
		
	}

}
