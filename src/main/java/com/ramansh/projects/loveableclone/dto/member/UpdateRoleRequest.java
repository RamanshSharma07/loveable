package com.ramansh.projects.loveableclone.dto.member;

import com.ramansh.projects.loveableclone.enums.ProjectRole;

public record UpdateRoleRequest(
        ProjectRole role
) {
}
