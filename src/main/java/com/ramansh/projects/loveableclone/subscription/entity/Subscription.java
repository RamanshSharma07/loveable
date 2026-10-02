package com.ramansh.projects.loveableclone.subscription.entity;

import com.ramansh.projects.loveableclone.plan.entity.Plan;
import com.ramansh.projects.loveableclone.subscription.enums.SubscriptionStatus;
import com.ramansh.projects.loveableclone.user.entity.User;
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
