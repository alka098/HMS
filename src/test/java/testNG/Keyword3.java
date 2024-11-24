package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keyword3 {

		
		@Test(priority=1, dependsOnMethods={"pu5"} )
		public void pu1() {
			
			System.out.println("pu1 is running");
			
		}
		
		
		
		@Test
	   public void pu2() {
			
			System.out.println("pu2 is running");
			
		}
		
		@Test
	   public void pu3() {
			
			System.out.println("pu3 is running");
			
		}
		
		@Test(timeOut=3000)
	   public void pu4() {
			
			System.out.println("pu4 is running");
			
		}
	 
		
		@Test(priority=0)
	   public void pu5() {
			
			System.out.println("pu5  is running");
			Assert.fail();
		}

	
}
