package RestAssured;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAddParam {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void AddNewPet() {
        String reqBody = """
        {
            "id": 8255, 
            "name": "Asha", 
            "status": "alive"
        }""";

        Response response = 
            given().contentType(ContentType.JSON) 
            .body(reqBody).when().post(ROOT_URI); 

        String body = response.getBody().asPrettyString();
        System.out.println(body);
    }
}
