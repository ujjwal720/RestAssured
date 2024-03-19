package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class cokkie {

	@Test
	public void coks() {

		Response res = given().get("https://www.google.com/");

		Map<String, String> io = res.getCookies();

		System.out.println(io);
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.getCookie("AEC"));

	}

}
