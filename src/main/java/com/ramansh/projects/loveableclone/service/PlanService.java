package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
