package Rahul;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class endtoendresponseswithjson {

	@Test
	public void test2() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String res = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"French-IN\"\r\n" + "}")
				.when().post("maps/api/place/add/json").then().log().all().statusCode(200).body("status", equalTo("OK"))
				.extract().response().asString();

		System.out.println(res);

		JsonPath a = new JsonPath(res);

		String op = a.getString("place_id");

		System.out.println(op);

		String newad = "India,Bilaspur";

		given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\""+op+"\",\r\n" + "\"address\":\"" + newad + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.put(" /maps/api/place/update/json").then().log().all().statusCode(200);

		String rem = given().queryParam("key", "qaclick123").queryParam("place_id", op).when()
				.get("/maps/api/place/get/json").then().extract().response().asPrettyString();

		System.out.println(rem);

	}

}
