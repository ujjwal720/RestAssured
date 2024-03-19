package dynamicjson;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class classone {
	
	
	@Test
	public void dynamics() {
		
		
		RestAssured.baseURI="http://216.10.245.166";
		
		String io=given().contentType("application/json").when().body(payui.payl()).post(" Library/Addbook.php").then().extract().response().asPrettyString();
		
		int a=given().contentType("application/json").when().body(payui.payl()).post(" Library/Addbook.php").then().extract().response().statusCode();
		
		System.out.println(io);
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
	}
	
	
}
