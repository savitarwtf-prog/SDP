package com.assignment.builder;

public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();

        System.out.println("=== 1. Building Domain Object Representation ===");
        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objectBuilder);
        EmailMessage welcomeEmail = objectBuilder.getResult();
        System.out.println("Result: " + welcomeEmail);

        System.out.println("\n=== 2. Building HTML Representation (Same Director recipe) ===");
        HtmlEmailBuilder htmlBuilder = new HtmlEmailBuilder();
        director.makeWelcomeEmail(htmlBuilder);
        String htmlPreview = htmlBuilder.getResult();
        System.out.println("Result HTML Output:\n" + htmlPreview);

        System.out.println("\n=== 3. Building Password Reset Email (HTML) ===");
        HtmlEmailBuilder resetHtmlBuilder = new HtmlEmailBuilder();
        director.makePasswordResetEmail(resetHtmlBuilder);
        System.out.println(resetHtmlBuilder.getResult());

        System.out.println("\n=== 4. Validation Testing ===");
        try {
            EmailObjectBuilder invalidBuilder = new EmailObjectBuilder();
            invalidBuilder.setSubject("Subject without recipient");
            invalidBuilder.getResult(); // Throws exception
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}