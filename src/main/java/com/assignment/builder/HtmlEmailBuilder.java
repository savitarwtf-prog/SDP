package com.assignment.builder;

public class HtmlEmailBuilder implements EmailBuilder {
    private String recipient;
    private String subject;
    private String body;
    private String attachmentPath;

    @Override
    public HtmlEmailBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public HtmlEmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public HtmlEmailBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public HtmlEmailBuilder setAttachment(String attachmentPath) {
        this.attachmentPath = attachmentPath;
        return this;
    }

    public String getResult() {
        if (recipient == null || recipient.trim().isEmpty()) {
            throw new IllegalStateException("Validation Error: Recipient email address is required.");
        }

        StringBuilder html = new StringBuilder();
        html.append("<div class=\"email-container\">\n")
                .append("  <h1>To: ").append(recipient).append("</h1>\n")
                .append("  <h2>Subject: ").append(subject != null ? subject : "(No Subject)").append("</h2>\n")
                .append("  <div class=\"email-body\">\n")
                .append("    <p>").append(body != null ? body : "").append("</p>\n")
                .append("  </div>\n");

        if (attachmentPath != null && !attachmentPath.trim().isEmpty()) {
            html.append("  <footer class=\"attachment\">Attachment: ")
                    .append(attachmentPath)
                    .append("</footer>\n");
        }

        html.append("</div>");
        return html.toString();
    }
}