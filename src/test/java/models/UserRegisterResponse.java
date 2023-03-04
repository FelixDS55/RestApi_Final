package models;

import lombok.Data;

@Data
public class UserRegisterResponse {
    private String token;
    private Integer id;

}
