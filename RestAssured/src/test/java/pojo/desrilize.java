package pojo;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class desrilize {
	
	
	@Test
	public void dm() {
		
		String b=given().contentType("application/json").when().post("https://reqres.in/api/users").then().log().all().extract().asPrettyString();
		coursesamout a=given().contentType("application/json").when().post("https://reqres.in/api/users").then().extract().as(coursesamout.class);
		
		System.out.println(a.getId());
		System.out.println(a.getCreatedAt());
		
		
	}

}
