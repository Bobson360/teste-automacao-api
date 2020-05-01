package commons;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.config.RestAssuredConfig;
public class Base {
	
		
		@Test
	    public void testGet() {

	        // Specify base URI
	        RestAssured.baseURI = "https://reqres.in/api/users?page=2";

	        // Request Object
	        RequestSpecification httpRequest = RestAssured.given();

	        // Response Object
	        Response response = httpRequest.request(Method.GET, "/2");

	        // Print response in console window
	        String responseBody = response.getBody().asString();
	        System.out.println("Response Body is: " + responseBody);

	        // Status code validation
	        int statusCode = response.getStatusCode();
	        System.out.println("Status code is: " + statusCode);
	        Assert.assertEquals(statusCode, 200);

	        // Status line verification
	        String statusLine = response.getStatusLine();
	        System.out.println("Status line is: " + statusLine);
	        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        
        
       }
}
