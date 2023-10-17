package com.kirimine170.learn.freemarker.service;

import com.kirimine170.learn.freemarker.model.Message;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class MessageService
{
    private List<Message> messages;

    public MessageService()
    {
        this.messages = new ArrayList<Message>();
    }

    public void addMessage(Message message)
    {
        this.messages.add(message);
    }

    public List<Message> getMessages()
    {
        return this.messages;
    }
}
