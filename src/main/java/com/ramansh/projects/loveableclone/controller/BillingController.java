package com.ramansh.projects.loveableclone.controller;

import com.ramansh.projects.loveableclone.dto.subscription.*;
import com.ramansh.projects.loveableclone.service.PlanService;
import com.ramansh.projects.loveableclone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BillingController {

    private final PlanService planService;

    private final SubscriptionService subscriptionService;

    @GetMapping("/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans() {
        return ResponseEntity.ok(
                planService.getAllActivePlans()
        );
    }

    @GetMapping("/me/subsciption")
    public ResponseEntity<SubscriptionResponse> getMySubscription() {
        Long userId = 1L;
        return ResponseEntity.ok(
                subscriptionService.getCurrentSubscription(userId)
        );
    }

    @PostMapping("/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckout(
            @RequestBody CheckoutRequest request
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(
                subscriptionService.createCheckoutSessionUrl(request, userId)
        );
    }

    @PostMapping("/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal() {
        Long userId = 1L;
        return ResponseEntity.ok(
                subscriptionService.openCustomerPortal(userId)
        );
    }
}
