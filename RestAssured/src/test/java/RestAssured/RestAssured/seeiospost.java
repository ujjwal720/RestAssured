package RestAssured.RestAssured;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class seeiospost   {
	
	@Test
	public void testy() throws FileNotFoundException {
	File a=new File("C:\\Users\\DELL\\eclipse-workspace\\RestAssured\\body.json");
	FileReader b=new FileReader(a);
	JSONTokener c=new JSONTokener(b);
	JSONObject d=new JSONObject(c);
	
	given().contentType("application/json").body(d.toString()).post("https://reqres.in/api/users").then().log().all();
	
	
	
	
	}
	

}
