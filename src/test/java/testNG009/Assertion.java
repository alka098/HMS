package testNG009;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	
	public void HardAssertion() {
		
		//METHOD1
		Assert.assertEquals(1234, 1234);
		
		//Method2
		String title="Flipkadt";
		String title2="Flipkart";
	    Assert.assertNotEquals(title2, title);
		
		
		
	}
	

}
