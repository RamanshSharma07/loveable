package com.ramansh.projects.loveableclone.controller;

import com.ramansh.projects.loveableclone.dto.subscription.PlanLimitsResponse;
import com.ramansh.projects.loveableclone.dto.subscription.UsageTodayResponse;
import com.ramansh.projects.loveableclone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usage")
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage() {
        Long userId = 1L;
        return ResponseEntity.ok(
                usageService.getTodayUsageOfUser(userId)
        );
    }

    @GetMapping("/limits")
    private ResponseEntity<PlanLimitsResponse> getPlanLimits() {
        Long userId = 1L;
        return ResponseEntity.ok(
                usageService.getTodaySubsccriptionLimitsOfUser(userId)
        );
    }
}
