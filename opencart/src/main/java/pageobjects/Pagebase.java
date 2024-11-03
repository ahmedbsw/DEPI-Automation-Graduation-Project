package pageobjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {
	
	protected WebDriver driver;
    protected JavascriptExecutor js;
    
    
    
	public Pagebase (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	protected static void clickbtn(WebElement clickables) {
		
		clickables.click();
		
	}
	public static void sendingvalue(WebElement textElement , String values) {
		
		textElement.sendKeys(values);
	}
	
	 public void scrollToBottom() {
		 js.executeScript("scrollBy(0,2500)"); 
	    }
	
	
	
	
		
	
	
	
	

}
