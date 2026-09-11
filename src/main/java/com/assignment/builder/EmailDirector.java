package com.assignment.builder;

public class EmailDirector {

    public void makeWelcomeEmail(EmailBuilder builder) {
        builder.setRecipient("new.user@example.com")
                .setSubject("Welcome to Our Platform!")
                .setBody("Thank you for joining us. We are excited to have you on board!");
    }

    public void makePasswordResetEmail(EmailBuilder builder) {
        builder.setRecipient("user@example.com")
                .setSubject("Password Reset Request")
                .setBody("Click the link below to reset your password. If you did not request this, please ignore this email.")
                .setAttachment("security_instructions.pdf");
    }
}