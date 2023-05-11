package com.example.messaging.listeners;

import com.example.messaging.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
