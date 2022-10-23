package com.example.demo.rest.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class LoginRequest {

    private String username;
    private String password;

}