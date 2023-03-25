package tests;

import config.Spec;
import models.LoginUnsuccessfulRequest;
import models.LoginUnsuccessfulResponse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;


public class LoginUnsuccessfulTest extends BaseTest {
    @Test
    void loginUnsuccessful(){
        LoginUnsuccessfulRequest unsuccessful = new LoginUnsuccessfulRequest();
        unsuccessful.setEmail("peter@klaven");

        LoginUnsuccessfulResponse response = Spec.request
                .log().all()
                .body(unsuccessful)
                .when()
                .post("/login")
                .then()
                .log().all()
                .spec(Spec.responseSpec400())
                .body("error", is("Missing password"))
                .extract().as(LoginUnsuccessfulResponse.class);

        assertThat(response.getError()).isEqualTo("Missing password");
    }
}
