package com.ramansh.projects.loveableclone.project_file.entity;

import com.ramansh.projects.loveableclone.project.entity.Project;
import com.ramansh.projects.loveableclone.user.entity.User;

import java.time.Instant;

public class ProjectFile {

    private Long id;

    private Project project;

    private String path;

    private String minioObjectKey; //to store the object in min-io

    private Instant createdAt;

    private Instant updatedAt;

    private User createdBy;

    private User updatedBy;
}
