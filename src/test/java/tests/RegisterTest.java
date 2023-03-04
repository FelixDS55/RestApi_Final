package tests;

import config.BaseTest;
import config.Spec;
import models.UserRegisterRequest;
import models.UserRegisterResponse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class RegisterTest extends BaseTest {
    @Test
    void userRegisterTest(){
        UserRegisterRequest userRegister = new UserRegisterRequest();
        userRegister.setEmail("eve.holt@reqres.in");
        userRegister.setPassword("pistol");

        UserRegisterResponse response = Spec.request
                .log().uri()
                .body(userRegister)
                .when()
                .post("/register")
                .then()
                .log().all()
                .spec(Spec.responseSpec200())
                .log().all()
                .extract().as(UserRegisterResponse.class);

        assertThat(response)
                .isNotNull()
                .extracting(UserRegisterResponse::getToken)
                .isEqualTo(response.getToken());

        assertThat(response)
                .isNotNull()
                .extracting(UserRegisterResponse::getId)
                .isEqualTo(response.getId());
    }
}
