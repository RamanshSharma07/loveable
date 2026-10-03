package com.ramansh.projects.loveableclone.entity;

import com.ramansh.projects.loveableclone.enums.SubscriptionStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Subscription {

    private Long id;

    private User user;

    private Plan plan;

    private SubscriptionStatus subscriptionStatus;

    private String stripeCustomerId;

    private String stripeSubscriptionId;

    private Instant currentPeriodStart;

    private Instant currentPeriodEnd;

    private Boolean cancelAtPeriodEnd = false;

    private Instant createdAt;

    private Instant updatedAt;
}
