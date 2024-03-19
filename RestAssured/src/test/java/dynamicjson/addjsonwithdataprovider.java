package dynamicjson;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class addjsonwithdataprovider {
	
	
	
	@Test(dataProvider="data")
	public void getresponsedynamic(String name,String id) {
		
		
		RestAssured.baseURI="http://216.10.245.166";
		
		
		given().contentType("application/json").body(payui.dynamicjon(name, id)).post("Library/Addbook.php").then().log().all();
	}
	
	
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] a= {{"123","sam"},{"1234","341"},{"231","klm"}};
		
		return a;
		
		
		
		
		
	}
	
	
	

}
