package com.assignment.builder;

public class EmailObjectBuilder implements EmailBuilder {
    private String recipient;
    private String subject;
    private String body;
    private String attachmentPath;

    @Override
    public EmailObjectBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public EmailObjectBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailObjectBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public EmailObjectBuilder setAttachment(String attachmentPath) {
        this.attachmentPath = attachmentPath;
        return this;
    }

    public EmailMessage getResult() {
        if (recipient == null || recipient.trim().isEmpty()) {
            throw new IllegalStateException("Validation Error: Recipient email address is required.");
        }
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalStateException("Validation Error: Subject line is required.");
        }
        return new EmailMessage(recipient, subject, body, attachmentPath);
    }
}