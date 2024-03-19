package revesionrestasured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class example1 {

	@Test
	public void test1() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String m = given().queryParam("key", "qaclick123").when().body(jsonfiles.json1())
				.post("/maps/api/place/add/json").then().extract().asPrettyString();

		System.out.println(m);

		JsonPath a = new JsonPath(m);

		String o = a.get("place_id");
		
		System.out.println(o);

	}

}
