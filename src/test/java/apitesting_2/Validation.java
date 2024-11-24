package apitesting_2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class Validation {
	


		
			// first way to apply validation by using of get method
		@Test
		 void getuser()
		
		{
			given()
			
			.headers("Authorization"," Bearer 0d0a689e2efe2a4e891a16c7ab96c9874d927b17e98df2f8347f85d0f02152c1")
			
			.when()
			.get("https://gorest.co.in/public/v2/users/7469184")
			
			.then()
			.statusCode(200)
			.body("gender",equalTo("male"))
			.log().all();	
		}
		 

	 @Test
		 void getuser2()
		 {
			 
			Response res= given() 
			 .headers("Authorization","Bearer 0d0a689e2efe2a4e891a16c7ab96c9874d927b17e98df2f8347f85d0f02152c1")
			 
			 .when()
                
			 .get("https://gorest.co.in/public/v2/users/7469184");
//			 Assert.assertEquals(res.getStatusCode(),200); // assert is a class and assert equals is a method
//			 Assert.assertEquals(res.header("Content-type"),"application/json; charset=utf-8");
			 
			 //validation implementation for the body
			 //get("") it fetch the value in object which is going to converted into string by using toString() method
			 
//			String body= res.jsonPath().get("gender").toString();
//			String id1= res.jsonPath().get("id").toString();
//			
//			 Assert.assertEquals(body, "male");
//			 Assert.assertEquals(id1,"7469184");
			 
			 
		 }

	}
	
	


