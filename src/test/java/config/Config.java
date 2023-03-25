package config;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static helpers.CustomApiListener.withCustomTemplates;

public class Config {

    @BeforeAll
    public static void beforeAll() {
        RestAssured.filters(withCustomTemplates());
        RestAssured.baseURI = "https://reqres.in";
    }
}
