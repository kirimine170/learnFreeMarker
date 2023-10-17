package com.kirimine170.learn.freemarker.model;

public class Message
{
    private String username;
    private String message;

    public Message(String username, String message)
    {
        this.username = username;
        this.message = message;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getMessage()
    {
        return this.message;
    }
}
