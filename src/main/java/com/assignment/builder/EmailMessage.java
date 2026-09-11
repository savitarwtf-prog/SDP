package com.assignment.builder;

public final class EmailMessage {
    private final String recipient;
    private final String subject;
    private final String body;
    private final String attachmentPath;

    EmailMessage(String recipient, String subject, String body, String attachmentPath) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.attachmentPath = attachmentPath;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachmentPath='" + attachmentPath + '\'' +
                '}';
    }
}