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

import org.testng.annotations.BeforeGroups;

import org.testng.annotations.AfterGroups;

public class Annotations1 {
  @Test
  public void f1() {
	  
	  System.out.println("Method F1 is running");
	  
  }
  
 // @Test
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method is running");
  }
  //@Test
  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod is running");
  }

 // @Test
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class is running");
  }

 // @Test
  @AfterClass
  public void afterClass() {
	  System.out.println("after class F1 is running");
  }

 // @Test
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test is running");
  }

  //@Test
  @AfterTest
  public void afterTest() {
	  System.out.println("after test is running");
  }

  //@Test
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("before suit is running");
  }

  //@Test
  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("aafter suit is running");
  }
  
  //@Test
  @BeforeGroups
  public void beforeGroups() {
	  
	  System.out.println("before groups is running");
  }
  
  //@Test
  @AfterGroups
  public void afterGroups() {
	  
	  System.out.println("before groups is running");
  }

}
