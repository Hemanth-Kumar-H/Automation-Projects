package tests;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ApiUtils;

public class UpdateDeleteUserTest {

    @Test
    public void updateUser() {
        JSONObject request = new JSONObject();
        request.put("name", "Hemanth Kumar");
        request.put("job", "SDET");

        Response res = ApiUtils.put("/users/2", request.toString());
        Assert.assertEquals(res.getStatusCode(), 200);
        System.out.println(res.getBody().asString());
    }

    @Test
    public void deleteUser() {
        Response res = ApiUtils.delete("/users/2");
        Assert.assertEquals(res.getStatusCode(), 204);
        System.out.println("Deleted successfully");
    }
}
