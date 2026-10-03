package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.subscription.PlanLimitsResponse;
import com.ramansh.projects.loveableclone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getTodaySubsccriptionLimitsOfUser(Long userId);
}
