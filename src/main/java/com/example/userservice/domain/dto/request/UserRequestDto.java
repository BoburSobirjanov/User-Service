package com.example.userservice.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDto {
    private String name;

    @NotBlank(message = "email must not be blank")
    private String email;

    @NotBlank(message = "email must not be blank")
    private String password;

    private List<String> roles;

    private List<String> permissions;
}
