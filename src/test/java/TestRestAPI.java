
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.objectweb.asm.TypeReference;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;


public class TestRestAPI {


    @Test
    public void testMockResponse() {
        // Perform a request to the mock endpoint using RestAssured
        Response response= (Response) RestAssured.given()
                .get("https://www.gov.uk/bank-holidays.json");
//                .then()
//                .assertThat()
//                .body("england-and-wales.events[2].title", equalTo("dd"));

        // Validating the response status code
        response.then().statusCode(200);


        // Validating the response body key-value pair using POJO class

        ExampleResponse responseBody = response.andReturn().getBody().as(ExampleResponse.class);
        String expectedValue = "value";
        String actualValue = responseBody.getScotland().getEvents().get(2).getDate();
        Assert.assertEquals(actualValue, expectedValue,"Noy ma");

//        JsonPath jsonPath = response.jsonPath();
//
//        String expectedValue = "england-and-waless";
//        String actualValue = jsonPath.getString("england-and-wales.events[2].title");
//        Assert.assertEquals(actualValue, expectedValue,"Not matched");
    }

}