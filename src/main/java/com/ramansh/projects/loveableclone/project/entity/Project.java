package com.ramansh.projects.loveableclone.project.entity;

import com.ramansh.projects.loveableclone.user.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Project {

    private Long id;

    private String name;

    private User owner;

    private Boolean isPublic = false;

    private Instant createdAt;

    private Instant updatedAt;

    private Instant deletedAt; //soft delete
}
