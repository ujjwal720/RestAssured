package revesionrestasured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class example3purchaseamount {

	
	@Test
	public void ourchaseamount() {
		
		
		String s=given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParam("grant_type", "client_credentials")
		.formParam("scope", "trust").when().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")
		.then().extract().asPrettyString();
		
		
		JsonPath b=new JsonPath(s);
		
		String io=b.getString("access_token");
		
		System.out.println(io);
		
		
	pojo1 iom=	given().queryParam("access_token", io).when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(pojo1.class);	
	
	System.out.println(iom.getExpertise());
	System.out.println(iom.getLinkedIn());
	System.out.println(iom.getCourses().getWebAutomation().toString());
	System.out.println(iom.getInstructor());
		
		
	

	}

}
