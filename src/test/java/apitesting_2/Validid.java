package apitesting_2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validid {

	
	 @Test
	 void getuser2()
	 {
		 
		Response r=given().baseuri("https://gorest.co.in/public/v2/users/7469184").headers("Authorization","Bearer 0e6957ef6feb2075db21187990d1b6c4c059f9b9cbbf1010a32ade9e134a9cfa")
				
				.when().get()
				
				
				
	
		 
		 
	 }
}
