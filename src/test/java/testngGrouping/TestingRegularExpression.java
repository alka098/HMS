package testngGrouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingRegularExpression {

	
	
	
	@Test(groups= {"Chrome.sanity"})
	public void w11() {
		
		
		System.out.println("method w11 is running");
	}
	@Test(groups= {"Chrome.smoke"})
    public void w12() {
		
		
		System.out.println("method w12 is running");
	}
	@Test(groups= {"firefox.regression"})
     public void w13() {
		
		
		System.out.println("method w13 is running");
		
		//Assert.fail();
	}
	@Test(groups= {"firefox.sanity"})
     public void w14() {
 		
 		
 		System.out.println("method w14 is running");
 		
 		//Assert.fail();
 	}
	@Test(groups= {"smoke"})
     public void w15() {
 		
 		
 		System.out.println("method w15 is running");
	}
	
}




