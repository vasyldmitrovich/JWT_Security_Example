package com.jwtsecurity.jwt_security.entity.auth;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AuthResponse {
    private String username;
    private String accessToken;
}
