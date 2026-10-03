package com.ramansh.projects.loveableclone.dto.member;

import com.ramansh.projects.loveableclone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long id,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
