package testNG009;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class SingleNewClass {
	
	WebDriver driver;
	
	@Test
	public void chrome() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://project1.qualibytes.com/backend/admin/index.php");
		
	}
	@Test
    public void edge() {
    	
    	driver=new EdgeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("https://project1.qualibytes.com/backend/admin/index.php");
    }

}
