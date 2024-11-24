package testNG009;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomWithPFlogical.PFLogicalPage;
import pomWithPFlogical.PFHomePage;


public class TestWithPF2 {
	
	
	PFLogicalPage a;
	PFHomePage b;
	
	 WebDriver driver;
	 
	 @Test
	 public void verifylogo() {
		 
		System.out.println("TS 1 is executing for logo verification") ;
		b.checklogo();
		 System.out.println("TS 1 is executed successfully and logo verified");
		 
	 }
	
	 @BeforeClass
     public void openbrowser() {  //passiing all the pre requisits
    	 
    	 System.out.println("opening browser");
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.get("https://project1.qualibytes.com/backend/admin/index.php");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    	 
    	 a=new PFLogicalPage(driver);
    	 b=new PFHomePage(driver); 
    	 
     }
	 @BeforeMethod
	 public void loginHMS() {
		 System.out.println("login into hms");
		 a.setusernamePF();
		 a.setpasswordPPF();
		 a.logbuttonPF();	 
	 }
	 
	 @AfterMethod
	 public void logoutHMS() {
		 System.out.println("Logout from hms");
		 b.checklogo();
		 b.options();
		 
		 
	 }
	 @AfterClass
	 public void closebrowser() {
		 
		System.out.println("Closing the browser");
		driver.quit();
		 
	 }
}
