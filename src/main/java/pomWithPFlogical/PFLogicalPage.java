package pomWithPFlogical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFLogicalPage {
	
		//declare
		//on which basis u will declare database------how much web elements we hv
		
		//use annotation--------always stars with @ symbol
		
		@FindBy(xpath="//input[@id='emailaddress']")  //annotation hmesha uss variale ke upar hoga
		private WebElement un;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement pw;
		
		@FindBy(xpath="//button[@name='admin_login']")
		private WebElement Loginbutton;
		
		
		WebDriver driver;
		
		public PFLogicalPage(WebDriver driver){
			
			
			PageFactory.initElements(driver, this);  //init element intialise krne me help kregi
			                        //driver phle aur this baad me q liya h comma q h???????????????????????????????????????????
			
		}
		public void setusernamePF() {
			
			un.sendKeys("admin@mail.com");
		}
		
		public void setpasswordPPF() {
			
			pw.sendKeys("Password@123");
			
			
		}
		
	    public void logbuttonPF() {
			
	    	Loginbutton.click();
	    
			
		}

}
