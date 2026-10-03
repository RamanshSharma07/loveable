package com.ramansh.projects.loveableclone.entity;

import com.ramansh.projects.loveableclone.enums.MessageRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ChatMessage {

    private Long id;

    private ChatSession chatSession;

//    private Project project;
//
//    private User user;

    private MessageRole role;

    private String content;

    // JSON array of Tools called
    private String toolCalls;

//    private String toolCallId;

    private Integer tokensUsed;

    private Instant createdAt;
}
