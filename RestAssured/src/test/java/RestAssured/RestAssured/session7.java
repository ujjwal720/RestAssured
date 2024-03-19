package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class session7 {

	
	
	@Test
	public void uy() {
		
		/*
		 * this for the headers
		 */
		
		
		given().get("https://www.google.com/").then().header("content-encoding","gzip");
		
		
		
		
		
		
		

	}

}
