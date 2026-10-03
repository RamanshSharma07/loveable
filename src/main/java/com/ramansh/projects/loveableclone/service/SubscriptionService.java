package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.subscription.CheckoutRequest;
import com.ramansh.projects.loveableclone.dto.subscription.CheckoutResponse;
import com.ramansh.projects.loveableclone.dto.subscription.PortalResponse;
import com.ramansh.projects.loveableclone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
