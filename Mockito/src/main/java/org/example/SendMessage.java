package org.example;

import java.util.ArrayList;
import java.util.List;

public class SendMessage {
    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message){
        this.messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }
}
