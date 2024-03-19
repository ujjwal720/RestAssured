package RestAssured.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     Response r_a=RestAssured.get("https://reqres.in/api/users?page=2");
		     System.out.println(r_a.asPrettyString());
		     System.out.println(r_a.getHeaders());
		
		
		
	}

}
