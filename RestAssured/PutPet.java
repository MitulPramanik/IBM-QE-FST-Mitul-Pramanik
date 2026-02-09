package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutPet {
    // Set Base URL
    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void AddNewPet() {
        // Write the request body
        String reqBody = """
        {
            \"id\": 8255, 
            \"name\": \"Asha\", 
            \"status\": \"alive\"
        }
        """;

        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .body(reqBody).when().put(ROOT_URI); // Send PUT request

        // Print the response
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        
       
    }
}
