package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import pomWithPFlogical.PFHomePage;
import pomWithPFlogical.PFLogicalPage;

public class TestSCwithPF2 {
	
	//common
	WebDriver driver ;
	
	  PFLogicalPage a;  //using mutiple classes at once
	  PFHomePage b;
	  
	  @Test
	  public void verifylogo() {
		  
		 System.out.println("TS 1 is executing for logo verification"); 
		 b.checklogo();
		 System.out.println("TS 1 executed sucucessfully");
		  
	  }
	  
	 @BeforeClass
	  public void openbrowser() {
		  System.out.println("open browser");
		  
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://project1.qualibytes.com/backend/admin/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  a=new PFLogicalPage(driver);
		  b=new PFHomePage(driver);
		  
	  }

	  @BeforeMethod
	  public void LoginHMS() {
		  
		  System.out.println("login into app");
		  a.setusernamePF();
		  a.setpasswordPPF();
		  a.logbuttonPF();
		  
	  }
	  @AfterMethod
      public void HomePageHMS() {
		  
		  System.out.println("log in into homepage");
		  b.checklogo();
		  b.options();
		  
		  
	  }
	  @AfterClass
      public void closebroswer() {
		  
		  System.out.println("close Broswer");
		  
		  driver.quit();
		  
		  
	  }
	  
	  
}
