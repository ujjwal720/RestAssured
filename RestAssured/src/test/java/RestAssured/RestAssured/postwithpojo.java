package RestAssured.RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class postwithpojo {
	
	
	
	
	
	@Test
	public void ps() {
		
		session4pojo s=new session4pojo();
		s.setName("ujjwal");
		s.setJob("qa");
		
		
		given().contentType("application/json").body(s).post("https://reqres.in/api/users").then().log().all();
		
		
		
		
		
		
	}

}
