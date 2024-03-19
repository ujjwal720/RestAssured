package pojo;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class estassu {

	@Test
	public void ms() {
		// TODO Auto-generated method stub

		String s = given()
				.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParam("grant_type", "client_credentials")
				.formParam("scope", " trust").when().log().all()
				.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();

		// System.out.println(s);

		String f = given()
				.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParam("grant_type", "client_credentials")
				.formParam("scope", " trust").when()
				.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").then().log().all().extract()
				.asString();

		System.out.println(f);

		JsonPath ui = new JsonPath(f);

		String l = ui.getJsonObject("access_token");

		System.out.println(l);
		
	String m=	given().queryParam("access_token", l).when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
		.then().log().all().extract().asPrettyString();
	
	System.out.println(m);
		
		
		

	}

}
