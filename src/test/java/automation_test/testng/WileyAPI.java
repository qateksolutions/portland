package automation_test.testng;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WileyAPI {
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void getJavaSearchResults() {
        RestAssured.baseURI = "https://www.wiley.com/en-us/search/autocomplete/";
        httpRequest= RestAssured.given();

        response = httpRequest.queryParam("term","Java").request(Method.GET, "/comp_00001H9J");
        response.getBody().prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
        JsonPath jsonPath = response.jsonPath();
        List<String> suggestions = jsonPath.get("suggestions.term");
        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }


    }

    public void postDynamicDelay() {
        RestAssured.baseURI = "https://httpbin.org/delay";
        httpRequest= RestAssured.given();

        response = httpRequest.request(Method.POST, "/5");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void getImageWithTypePng() {
        RestAssured.baseURI = "https://httpbin.org/image/png";
        httpRequest= RestAssured.given();

        response = httpRequest.request(Method.GET);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
