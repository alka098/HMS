package testNG;

import org.testng.annotations.Test;

public class Keyword1 {

	@Test
	(priority=1)
	public void xyz() {
		
		System.out.println("XYZ is running");
		
	}
	
	@Test (priority=1)
   public void abc() {
		
		System.out.println("abc is running");
		
	}
	
	@Test 
   public void pqr() {  
		
		System.out.println("pqr is running");
		
	}
	
	@Test(priority=0)
   public void def() {
		
		System.out.println("def is running");
		
	}
 
	
	@Test(priority=0)
   public void mno() {
		
		System.out.println("mno is running");
		
	}
}
