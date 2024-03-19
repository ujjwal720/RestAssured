package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;


public class session3 {


	@Test
	public void js() {
		// TODO Auto-generated method stub
		
		JSONObject a=new JSONObject();
		a.put("name","ujjwal");
		a.put("job", "qa");
		
		given().contentType("application/json").body(a.toString()).post("https://reqres.in/api/users").then().statusCode(201).log().all();
		
	}

}
