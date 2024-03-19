package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class first {

	@Test
	public void boat() {

		given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities").then().log().all();
		/*
		 * following is to run the api n rest assured.
		 */

		Response a = given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities");

		System.out.println(a.getStatusCode());
		
		/*
		 * the folowing code for basicalling getting the status code
		 */

	}

}
