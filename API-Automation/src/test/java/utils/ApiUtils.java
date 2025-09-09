package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtils {

    public static Response get(String endpoint) {
        return RestAssured.get(ConfigReader.getBaseURL() + endpoint);
    }

    public static Response post(String endpoint, String body) {
        return RestAssured.given().header("Content-Type", "application/json").body(body)
                .post(ConfigReader.getBaseURL() + endpoint);
    }

    public static Response put(String endpoint, String body) {
        return RestAssured.given().header("Content-Type", "application/json").body(body)
                .put(ConfigReader.getBaseURL() + endpoint);
    }

    public static Response delete(String endpoint) {
        return RestAssured.delete(ConfigReader.getBaseURL() + endpoint);
    }
}
