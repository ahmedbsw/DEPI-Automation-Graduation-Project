package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Testbase {
	public static String firistString = "Ahmed";
	public static String lString = "Tah";
	public static String validemailString = "ahmed2133@gmail.com";
	public static String emailnotexist = "test@notexist.com";
	public static String existmail = "ahmed4333333344144334@gmail.com";

	public static String telphon = "01024989169";
	public static String password = "12345678";
	public static String confirm = "12345678";
	public static String wrongconfirm = "12344321";

	WebDriver driver;

	@BeforeSuite
	public void browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://awesomeqa.com/ui/index.php?route=common/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
