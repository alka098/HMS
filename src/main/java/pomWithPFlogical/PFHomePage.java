package pomWithPFlogical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFHomePage {
	

		@FindBy(xpath="//img[@src='assets/images/logo-light.png']")
		private WebElement logo;
		
		@FindBy(xpath="//i[@class='fe-menu']")
		private WebElement option;
		WebDriver driver;
		
		public PFHomePage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);  //iss method ka use construcyt me krenge
			
		}
		
		public void checklogo() {
			
			boolean	result=logo.isDisplayed();
			if(result==true) {
				System.out.println("Logo is displayed");
				
			}else {
				System.out.println("Logo is not displayed");
			}
				
			
			}
		    public void options() {
				
		    	option.click();
				
			}

	}
