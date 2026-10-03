package com.ramansh.projects.loveableclone.dto.project;

import com.ramansh.projects.loveableclone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        UserProfileResponse owner,
        Instant createdAt,
        Instant updatedAt
) {
}
