package tests;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ApiUtils;

public class CreateUserTest {

    @Test
    public void createUser() {
        JSONObject request = new JSONObject();
        request.put("name", "Hemanth");
        request.put("job", "QA Automation");

        Response res = ApiUtils.post("/users", request.toString());
        Assert.assertEquals(res.getStatusCode(), 201);
        System.out.println(res.getBody().asString());
    }
}
