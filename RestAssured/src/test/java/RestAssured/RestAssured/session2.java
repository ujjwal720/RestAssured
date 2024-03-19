package RestAssured.RestAssured;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class session2 {

	@Test
	public void am() {

		HashMap<String, String> a = new HashMap<String, String>();
		a.put("name", "ujjwal");
		a.put("job", "qa");

		 given().contentType("application/json").body(a).post("https://reqres.in/api/users").then().log().all();

		

	}

}
