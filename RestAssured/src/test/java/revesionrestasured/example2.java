package revesionrestasured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class example2 {

	@Test
	public void test3() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String m = given().queryParam("key", "qaclick123").when().body(jsonfiles.json1())
				.post("/maps/api/place/add/json").then().extract().asPrettyString();

		System.out.println(m);

		JsonPath a = new JsonPath(m);

		String o = a.get("place_id");

		System.out.println(o);
		
		String address="Bilaspur,delhi";

		String actual = given().queryParam("key", "qaclick123").when()
				.body("{\r\n" + "\"place_id\":\"" + o + "\",\r\n" + "\"address\":\""+address+"\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.put("/maps/api/place/update/json").then().extract().asPrettyString();

		//System.out.println(actual);
		
		
		int i_os=given().queryParam("key", "qaclick123").queryParam("place_id", o).when().get(" /maps/api/place/get/json")
		.then().statusCode(200).extract().response().statusCode();
		
		System.out.println(i_os);
		
		
		

	}

}
