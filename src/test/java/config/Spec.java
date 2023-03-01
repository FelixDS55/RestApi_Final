package config;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;
public class Spec {
    public static RequestSpecification request = with()
            .basePath("/api")
            .log().all()
            .contentType(ContentType.JSON);
}
