package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlistpage extends Pagebase {

	public Wishlistpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//button[@data-toggle=\"tooltip\"])[1]")
	
	WebElement addwishlistElement ;
	
	@FindBy(xpath = "//*[@id=\"wishlist-total\"]/span")
	public WebElement alertmessagElement ;
	 
	
	
	public void clickwishlist() {
		clickbtn(addwishlistElement);
		
	}

}
