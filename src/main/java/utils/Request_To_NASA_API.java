package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import mars_photos.Photo;
import org.json.JSONArray;
import org.json.JSONObject;

public class Request_To_NASA_API {

    private static String requestedURL =
            "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&camera=fhaz&api_key=DEMO_KEY";

    public static Response getResponseBySolarDay() {
        return RestAssured
                .given()
                    .relaxedHTTPSValidation()
                .when()
                    .get(requestedURL)
                .then()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .extract().response();
    }

    private static Photo getResponse2() {
        return RestAssured
                .given()
                .relaxedHTTPSValidation()
                .when()
                .get(requestedURL).as(Photo.class);
    }

    private static JSONObject getJsonObject() {
        return new JSONObject(getResponseBySolarDay().asString());
    }

    private static JSONArray getJsonArray() {
        return getJsonObject().getJSONArray("photos");
    }

    public static int getJsonArrayLength() {
        return getJsonArray().length();
    }

    public static long getSolarDayNumber() {
        for(int i = 0; i < getJsonArrayLength(); i++)
            if (1000 != getJsonArray().getJSONObject(i).getLong("sol")) return -1;
        return 1000;
    }
}
