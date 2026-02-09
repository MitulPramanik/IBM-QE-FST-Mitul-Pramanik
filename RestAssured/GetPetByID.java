package RestAssured;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class GetPetByID {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet/";

     @Test(dataProvider = "petIdProvider")
    public void GetPetDetails(String id) {
        Response response = 
            given().contentType(ContentType.JSON)
            .when().get(ROOT_URI + "/8255"); 
        String responseBody = response.getBody().asPrettyString();
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println("Status Code is => " + response.getStatusCode());

        
    }

    

    @DataProvider
    public Object[][] GetPetDetails() {
        Object[][] testData = new Object[][] { { "77232" }, { "77233" } };
        return testData;
    }
    
}
