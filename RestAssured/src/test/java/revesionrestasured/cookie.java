package revesionrestasured;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.RestAssured;

public class cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String i= given().queryParam("key", "qaclick123").when().body(jsonfiles.json1())
				.post("/maps/api/place/add/json").then().extract().asString();
		
		
		System.out.println(i);
		

	}

}
