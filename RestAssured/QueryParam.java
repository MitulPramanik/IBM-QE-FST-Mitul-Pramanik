package RestAssured;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class QueryParam {
   
    final static String ROOT_URI = "http://ip-api.com/json";

    @Test
    public void getIPInformation() {
        String abc = "http://ip-api.com/json";
        Response response = 
            given().contentType(ContentType.JSON)
            .when().queryParam("fields", "query,country,city,timezone")
            .get(abc + "/125.219.5.94");
        //String responseBody = response.getBody().asPrettyString();
        System.out.println(response.getBody().asPrettyString());
    } 
}
