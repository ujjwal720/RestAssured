package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



public class Session1 {
	
	
	@Test
	public void ms() {
		
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(2000).log().all();
		
		
		
		
		
	}

}
