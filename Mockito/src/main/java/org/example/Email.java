package org.example;

import java.text.Format;

public class Email {
    private String emailAddress;
    private String message;
    private EmailFormat format;

    public Email(String emailAddress, String message, EmailFormat format) {
        this.emailAddress = emailAddress;
        this.message = message;
        this.format = format;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMessage() {
        return message;
    }

    public EmailFormat getFormat() {
        return format;
    }
}