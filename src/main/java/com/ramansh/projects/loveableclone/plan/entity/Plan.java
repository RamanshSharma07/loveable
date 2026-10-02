package com.ramansh.projects.loveableclone.plan.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plan {

    private Long id;

    private String name;

    private String stipePriceId;

    private Integer maxProjects;

    private Integer maxTokensPerDay;

    private Integer maxPreviews;

    private Boolean unlimitedAi;

    private Boolean active;
}
