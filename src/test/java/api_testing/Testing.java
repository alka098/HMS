package api_testing;

import org.testng.annotations.Test;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.*;


public class Testing {
	
	@Test
	void getUser() {

	    given()
	        .header("Authorization", "Bearer 73cf29c802015e025f03216d2839e3191e837a514dc472b0035ed19be94b0282")
	        
	    .when()
	        .get("https://gorest.co.in/public/v2/users/6942443")
	        
	    .then()  //validation
	        .statusCode(200)
	        .body("gender", equalTo("male"))
	        .log().all();
	}
    @Test
	void createUser() {
		
		HashMap hm = new HashMap();
		hm.put("name", "alka kumari");
		hm.put("gender", "female");
		hm.put("email", "alkak9806@mail.com");
		hm.put("status", "active");
		
		given()
		.body(hm)
		.headers("Authorization","Bearer 73cf29c802015e025f03216d2839e3191e837a514dc472b0035ed19be94b028")
		.contentType("application/json")
		
		.when()
		.post("https://gorest.co.in/public/v2/users")
		
		.then()
		     .statusCode(201)
		     .log().all();
		
	}
}
