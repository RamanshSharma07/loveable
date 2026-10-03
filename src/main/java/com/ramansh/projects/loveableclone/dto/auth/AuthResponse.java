package com.ramansh.projects.loveableclone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
