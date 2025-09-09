package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ApiUtils;

public class GetUserTest {

    @Test
    public void getListUsers() {
        Response res = ApiUtils.get("/users?page=2");
        Assert.assertEquals(res.getStatusCode(), 200);
        System.out.println(res.getBody().asString());
    }

    @Test
    public void getSingleUser() {
        Response res = ApiUtils.get("/users/2");
        Assert.assertEquals(res.getStatusCode(), 200);
        System.out.println(res.getBody().asString());
    }
}
