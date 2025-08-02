package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

}
