package RestAssured.RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class jsonparser {

	
	/*
	 * json parser
	 */
	@Test
	public void pl() {
		
		given().get("https://reqres.in/api/users?page=2").then().body("data[1].email",equalTo("sm@gmail.com"));
		
		
		
		
		
		

	}

}
