package com.ramansh.projects.loveableclone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ChatSession {

    private Project project;

    private User user;

    private String title;

    private Instant createdAt;

    private Instant upatedAt;

    private Instant deletedAt; //soft delete
}
