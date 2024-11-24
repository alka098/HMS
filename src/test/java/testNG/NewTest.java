package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Method f is runnning");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod is running");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod is running");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass class is running ");
  }
 

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass is running");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest is running");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest is running");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite is running");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite is running");
  }

}
