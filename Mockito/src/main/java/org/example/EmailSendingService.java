package org.example;


public class EmailSendingService {

    private SendingPlatform platform;

    public  void sendEmail(String emailAddress, String message, boolean htmlFormat) {
        Email email = null;

        if (htmlFormat) {
            email = new Email(emailAddress, message, EmailFormat.HTML);
        } else {
            email = new Email(emailAddress, message, EmailFormat.TEXT);
        }

        platform.sendEmail(email);
    }
}