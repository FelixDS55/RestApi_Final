package config;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class Config {

    @BeforeAll
    public static void beforeAll() {
        RestAssured.baseURI = "https://reqres.in";
    }
}
