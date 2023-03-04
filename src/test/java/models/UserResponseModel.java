package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponseModel {
    private Integer id = 2;
    private String email = "janet.weaver@reqres.in";
    @JsonProperty("first_name")
    private String firstName = "Janet";
    @JsonProperty("last_name")
    private String lastName = "Weaver";
}
