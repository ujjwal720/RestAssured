package RestAssured.RestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.junit.Assert;

public class parser1 {

	@Test
	public void ms() {
		
		
		Response a=given().contentType(ContentType.JSON).get("https://reqres.in/api/users?page=2");
		
	
		
		//Assert.assertEquals(a.jsonPath().get("data[1].email").toString(),"ml@gmail.com");
		
		JSONObject n_m=new JSONObject(a.asString());
		
	
		
		
		
		for(int i=0;i<=n_m.getJSONArray("data").length()-1;i++) {
			
			
			String l=n_m.getJSONArray("data").getJSONObject(i).get("id").toString();
			System.out.println(l);
			
			
			
		}

	}

}
