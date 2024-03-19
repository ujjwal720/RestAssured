package RestAssured.RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class queryamdpath {

	@Test
	public void tsm() {

		given().pathParam("mypath", "users").queryParam("page", 1).queryParam("id", 5)
				.get("https://reqres.in/api/{mypath}").then().log().all();
		
		
		

	}

}
