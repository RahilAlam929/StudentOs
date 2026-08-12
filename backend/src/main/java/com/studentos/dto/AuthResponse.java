package com.studentos.dto;

public record AuthResponse(
        String accessToken,
        String tokenType,
        long expiresIn,
        UserResponse user
) {
    public AuthResponse(String accessToken, long expiresIn, UserResponse user) {
        this(accessToken, "Bearer", expiresIn, user);
    }
}
