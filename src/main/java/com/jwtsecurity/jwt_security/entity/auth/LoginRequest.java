package com.jwtsecurity.jwt_security.entity.auth;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LoginRequest {
    private String username;
    private String password;
}
