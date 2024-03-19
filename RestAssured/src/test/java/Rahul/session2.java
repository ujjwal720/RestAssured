package Rahul;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class session2 {

	@Test
	public void takes() {

		int formjson = 0;
		int actual = 0;
		JsonPath a = new JsonPath(payloads.courserprice());

		int m = a.getInt("courses.size()");

		System.out.println(m);

		/*
		 * course size is working in this scenario
		 */

		for (int i = 0; i < 3; i++) {

			String price = a.getString("courses[" + i + "].price");

			String copies = a.getString("courses[" + i + "].copies");

			int ui = Integer.parseInt(price) * Integer.parseInt(copies);

			formjson = formjson + ui;

		}

		actual = a.getInt("dashboard.purchaseAmount");
		System.out.println(formjson);

		System.out.println(actual);

		if (formjson == actual) {

			System.out.println("The json are equal it can be done and the price is also correct");

		}

		else {
			
			System.out.println("The prices is not equal in the json");

		}

	}

}