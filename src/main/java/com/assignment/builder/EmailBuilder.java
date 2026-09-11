package com.assignment.builder;

public interface EmailBuilder {
    EmailBuilder setRecipient(String recipient);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
    EmailBuilder setAttachment(String attachmentPath);
}