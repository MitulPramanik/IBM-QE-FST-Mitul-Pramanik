package RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeletePet {
    // Set Base URL
    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void AddNewPet() {
        Response response = 
            given().contentType(ContentType.JSON)
            .when().delete(ROOT_URI + "/77232");
        
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        
        
    }
    
}
