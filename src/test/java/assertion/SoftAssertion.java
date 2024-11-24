package assertion;

import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	

	public void softAssertion() {   //we need to create object in soft assertion
		
		
		System.out.println("flipkart");
		System.out.println("flipkard");
		
		SoftAssert s = new SoftAssert();  //creation of object '... ye khi b create kr skte h
		s.assertEquals("1", "2");   //call with any method you want studied above
	
		System.out.println("flipkar");
		System.out.println("flipkart");
		
		s.assertAll();   //mandatory  //always at the end
		
		//most of the time hard assertion use hota h soft will be used only when needed 
		
	}
	
}
