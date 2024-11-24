package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Dashboard {
	
	
	WebDriver Idriver;
	
	public Dashboard(WebDriver rdriver) {
		
		Idriver =rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@name='admin_login']")
	WebElement button;
	
     public void dashboard() {
	
	button.click();
}

}
