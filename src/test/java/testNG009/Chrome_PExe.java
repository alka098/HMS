package testNG009;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomWithPFlogical.PFLogicalPage;
import pomWithPFlogical.PFHomePage;
import org.testng.annotations.Test;
public class Chrome_PExe {
	
	PFLogicalPage a;
	PFHomePage b;
	@Test 
	public void prerequesite() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://project1.qualibytes.com/backend/admin/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		a=new PFLogicalPage(driver);
		b=new PFHomePage(driver);
		
	}
	
	@Test
	public void un() {
		a.setusernamePF();
	}
	
	@Test
	public void pw() {
		a.setpasswordPPF();
	}
	
	
	@Test
	public void button() {
		a.logbuttonPF();
	}
	
	@Test
	public void logo() {
		
		b.checklogo();
	}
	
   @Test
    public void option() {
		
		b.options();
	}
	
}
