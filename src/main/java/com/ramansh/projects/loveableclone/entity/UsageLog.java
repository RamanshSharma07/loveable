package com.ramansh.projects.loveableclone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UsageLog {

    private Long id;

    private User user;

    private Project project;

    private String action;

    private Integer tokensUsed;

    private Integer durationMs;

    // JSON
    private String metaData;

    private Instant createdAt;
}
