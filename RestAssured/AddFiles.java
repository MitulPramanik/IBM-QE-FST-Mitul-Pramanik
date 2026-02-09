package RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import java.io.File;
import io.restassured.response.Response;

public class AddFiles {
    // Set base URL
    String ROOT_URI = "https://petstore.swagger.io/v2/pet/{petId}/uploadImage";

    @Test
    public void addPetImage() {
        // Get file to upload
        File petImage = new File("C:\\Users\\MitulPramanik\\Downloads\\pet.webp");
        Response response = given().multiPart(petImage) // Add image to upload
            .pathParam("petId", "8255") // Set petId parameter
            .when().post(ROOT_URI); // Send POST request

        // Print response
        System.out.println(response.asPrettyString());

    }
}
