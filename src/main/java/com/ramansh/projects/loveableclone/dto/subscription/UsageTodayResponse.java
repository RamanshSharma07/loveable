package com.ramansh.projects.loveableclone.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewLimit
) {
}
