package com.ramansh.projects.loveableclone.entity;

import com.ramansh.projects.loveableclone.enums.ProjectRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ProjectMember {

    private ProjectMemberId id;

    private Project project;

    private User user;

    private ProjectRole projectRole;

    private Instant invitedAt;

    private Instant acceptedAt;
}
