package api;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

public class APITest {

	@Test
	public void testValidaStatus() {
		String uriBase = "https://reqres.in/api/users?page=2";
		given()
		.relaxedHTTPSValidation()
		.when()
			.get(uriBase)
		.then()
			.statusCode(200);
	}

}
