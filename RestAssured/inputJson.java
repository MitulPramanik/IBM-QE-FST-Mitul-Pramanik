package RestAssured;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class inputJson {
    // Set base URL
final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void addNewPet() throws IOException {
        // Import JSON file
        File file = new File("src/test/resources/input.json");

        Response response = given()
            .contentType(ContentType.JSON) // Set headers
            .body(file) // Pass request body from file
            .when().post(ROOT_URI); // Send POST request

        // Print response
        String body = response.getBody().asPrettyString();
        System.out.println(body);
        

        
    }
}
