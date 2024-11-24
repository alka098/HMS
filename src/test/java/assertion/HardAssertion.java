package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class HardAssertion {
	
	
	@Test  
   public void test() {	 //we will create method with any name
	
		
		
		//1st way
		//Assert.assertEquals("Flipkart","Flipkard");  //test case failed qki same nhi h
	                                                  // java.lang.AssertionError: expected [Flipkard] but found [Flipkart]
	//	Assert.assertEquals("Flipkart","Flipkart");  //test case passed bcs both are same
		
		//2nd way
		
		/*
		String expRes="Flipkart";
		String ActRes="Flipkart";
		Assert.assertEquals(expRes , ActRes);   //test case passed
		*/
	
		
		//Assert.assertNotEquals("Amazon", "Ammazon");  //test case passed  //PASSED: assertion.HardAssertion.test
		
		
		
		//Assert.assertNotEquals("Amazon", "Amazon");  //Failed // did not expect [Amazon] but found [Amazon]
	
		//Assert.assertNotEquals("1234", "1234"); //failed//java.lang.AssertionError: did not expect [1234] but found [1234]
		
		
		//Assert.assertTrue(true);  //passed
		
		//String f="false";  //isse nhi ho rha h
		//Assert.assertTrue(false);  //failed
		
		//Assert.assertFalse(false);  //passed
	//	Assert.assertFalse(25>25);//passed
	//	Assert.assertFalse(24>25);//passed
		
		//Assert.assertNull(null);    //passed
		
		//Assert.assertNotNull(null);  //failed //java.lang.AssertionError: expected object to not be null
		
		//Assert.assertNotNull("gvgfgghjh");  //passed
		
		
		
		//ASSERTION WILL ALWAYS BE USED AT THE END OF THE PRINTING STATEMENT
	
	
		System.out.println("flipkard");
		System.out.println("flipkart");
		
		Assert.assertEquals("2", "2");
		
		System.out.println("flipkardd");
		System.out.println("flipkartt");
		
		
	}

    
}
