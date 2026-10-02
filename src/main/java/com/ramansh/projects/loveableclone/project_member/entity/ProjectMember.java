package com.ramansh.projects.loveableclone.project_member.entity;

import com.ramansh.projects.loveableclone.project.entity.Project;
import com.ramansh.projects.loveableclone.project_member.enums.ProjectRole;
import com.ramansh.projects.loveableclone.user.entity.User;
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
