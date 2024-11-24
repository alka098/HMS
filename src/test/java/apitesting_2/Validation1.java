package apitesting_2;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.core.IsEqual.*;

import java.util.HashMap;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;


public class Validation1 {
	
int val;
	
	@Test
	void getUser()
	{
	   //this method is going to be divided in three sections
	   // given section || when section ||  then section
		
	int val ;
			given()     // Pre-Requisit or pre-condition in form of authentication which is bear token.
		           // In this section we are going to provide some information
		          // Last statement is going to be executed from semi-column other than that nothing to be 
		          // required to use the semi-column
		
		.headers("Authorization","Bearer 0e6957ef6feb2075db21187990d1b6c4c059f9b9cbbf1010a32ade9e134a9cfa")
		
		.when()    //   provide http request 
		          //   In this section we are going to provide some information 
		
		.get("https://gorest.co.in/public/v2/users/"+val) // As it is copy from postman url get request
		
		.then()    // validation  based on status code , response body
		          // In this section we are going to provide some information
		
		.statusCode(200)
		.body("email",equalTo("mdfaizal100qr@gmail.com"))
		.log().all(); // complete record ko console mai print karwane ke liye ye method ka use hoga.
	
	}

	
	

}
