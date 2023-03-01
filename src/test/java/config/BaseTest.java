package config;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static helpers.CustomApiListener.withCustomTemplates;

public class BaseTest {
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeAll
    public static void beforeAll() {
        RestAssured.filters(withCustomTemplates());
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/apidoc/";
    }
}
