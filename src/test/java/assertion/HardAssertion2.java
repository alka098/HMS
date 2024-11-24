package assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomWithPFlogical.PFLogicalPage;
import pomWithPFlogical.PFHomePage;


public class HardAssertion2 {

		
		WebDriver driver;
		PFLogicalPage a;
		PFHomePage b;
		
		public void openbrowser() {
			
			System.out.println("Open the browser");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://project1.qualibytes.com/backend/admin/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			a=new PFLogicalPage(driver);
			b=new PFHomePage(driver);
		}

		
		
		
		
}
