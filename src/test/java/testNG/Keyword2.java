package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keyword2 {
	
	@Test(invocationCount=0 )   //same method wants to be executed 2 or more times
	public void pu1() {
		
		System.out.println("pu1 is running");
		
	}
	
	
	
	@Test (enabled=false)
	
   public void pu2() {
		
		System.out.println("pu2 is running");
		
	}
	
	@Test
   public void pu3() {
		
		System.out.println("pu3 is running");
		
	}
	
	@Test
   public void pu4() {
		
		System.out.println("pu4 is running");
		Assert.fail();
		
	}
 
	
	@Test
   public void pu5() {
		
		System.out.println("pu5  is running");
		
	}

}
