package com.example.mail;

import java.util.ArrayList;

public class MailParent {
    private String subject;
    private ArrayList <String> to;
    private String from;
    private String content;
    private ArrayList<String> attachments;
    private String date;

    public MailParent(){}
    public MailParent(String subject, ArrayList<String> to, String from, String content, ArrayList<String> attachments, String date){
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.content = content;
        this.attachments = attachments;
        this.date = date;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    public void setTo(ArrayList<String> to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<String> attachments) {
        this.attachments = attachments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}