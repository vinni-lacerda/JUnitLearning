package org.example;

import java.text.Format;

public class Email {
    private String emailAddress;
    private String message;
    private Format format;

    public Email(String emailAddress, String message, Format format) {
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

    public Format getFormat() {
        return format;
    }
}