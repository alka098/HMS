package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit1 {
	
	@Test
	
	public void t1() {
		
		
		System.out.println("method t1 is running");
	}
	@Test
    public void t2() {
		
		
		System.out.println("method t2 is running");
	}
	@Test
     public void t3() {
		
		
		System.out.println("method t3 is running");
		
		Assert.fail();;
	}
	@Test
     public void t4() {
 		
 		
 		System.out.println("method t4 is running");
 		
 		Assert.fail();
 	}
	@Test
     public void t5() {
 		
 		
 		System.out.println("method t5 is running");
 	}
	@Test
     public void t6() {
 		
 		
 		System.out.println("method t6 is running");
 	}
	@Test
     public void t7() {
 		
 		
 		System.out.println("method t7 is running");
 	}
	@Test
     public void t8() {
 		
 		
 		System.out.println("method t8 is running");
 	}
	
	@Test
     public void t9() {
 		
 		
 		System.out.println("method t9 is running");
 	}
     
   
}
