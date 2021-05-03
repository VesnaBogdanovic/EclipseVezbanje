import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.Payload;
import files.ReUsableMethods;

public class Basics {

	public static void main(String[] args) throws IOException {
		// Validate if AddPlace is working as expected
		// Add place
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				/*.body(new String(Files.readAllBytes(Paths.get(
						"C:\\Users\\vesna\\Desktop\\GitRepo\\PracticeBasicsEclipse\\RestProject\\src\\externiFile.json"))))
						Ovako radim ako koristim eksterni json file(dodam u eclipse projekat,dam putanju do njega,
						konvertujem u byte pa u String
						*/
				.body(Payload.AddPlace())
				.when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().response()
				.asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response); // for parsing json
		String placeId = js.getString("place_id");
		System.out.println(placeId);

<<<<<<< HEAD
		// Update place with new address
=======
		// Update place
		
>>>>>>> e27efa8d221073a1e96d7b1543fc83ce84ce8b1b
		String newAddress = "Summer Walk, Africa";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// GetPlace to validate if new Address is present in response

		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
				.response().asString();
		// JsonPath js1 = new JsonPath(getPlaceResponse); for parsing json
		JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);

	}

}
