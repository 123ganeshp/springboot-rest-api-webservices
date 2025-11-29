package com.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "User First name should not be Null or Empty")
    private String firstName;
    @NotEmpty(message = "User Last name should not be Null or Empty")
    private String lastName;
    @NotEmpty(message = "User Email should not be Null or Empty")
    @Email(message = "Email address should be valid")
    private String email;
}
