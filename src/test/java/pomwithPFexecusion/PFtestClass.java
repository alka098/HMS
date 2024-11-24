package pomwithPFexecusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomWithPFlogical.PFHomePage;
import pomWithPFlogical.PFLogicalPage;

public class PFtestClass {
	
public static void main (String args []){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://project1.qualibytes.com/backend/admin/his_admin_dashboard.php");
		
		PFLogicalPage log = new PFLogicalPage(driver);
		log.setusernamePF();
		log.setpasswordPPF();
		log.logbuttonPF();
		
		PFHomePage home = new  PFHomePage(driver);
		 home.checklogo();
		 home.options();
		 

}}

