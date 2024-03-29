package com.example.mail;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class MailBuilder implements Serializable {
    private String subject;
    private ArrayList<String> to;
    private ArrayList<String> cc;
    private ArrayList<String> bcc;
    private String from;
    private String content;
    private ArrayList<Attachment> Attachments;
    private int priority;
    private int mailID;
    private LocalDate localDate;
    private LocalTime localTime;
    private String mailType;

    public MailBuilder(){}
    public MailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public MailBuilder setTo(ArrayList<String> to) {
        this.to = to;
        return this;
    }

    public MailBuilder setCc(ArrayList<String> cc) {
        this.cc = cc;
        return this;
    }

    public MailBuilder setBcc(ArrayList<String> bcc) {
        this.bcc = bcc;
        return this;
    }

    public MailBuilder setFrom(String from) {
        this.from = from;
        return this;
    }

    public MailBuilder setContent(String content) {
        this.content = content;
        if(this.content == null)this.content = "";
        return this;
    }

    public MailBuilder setAttachments(ArrayList<Attachment> Attachments) {
        this.Attachments = Attachments;
        if(this.Attachments == null)
            this.Attachments = new ArrayList<>();
        System.out.println("HEllo from builder Attachements" + this.Attachments);
        return this;
    }

    public MailBuilder setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public MailBuilder setMailID(int mailID) {
        this.mailID = mailID;
        return this;
    }
    public MailBuilder setLocalDate(){
        this.localDate = LocalDateTime.now().toLocalDate();
        return this;
    }
    public MailBuilder setLocalTime(){
        this.localTime = LocalDateTime.now().toLocalTime();
        return this;
    }
    public MailBuilder setOldLocalDate(LocalDate localDate){
        this.localDate = localDate;
        return this;
    }
    public MailBuilder setOldLocalTime(LocalTime localTime){
        this.localTime = localTime;
        return this;
    }
    public MailBuilder setMailType(String mailType) {
        this.mailType = mailType;
        return this;
    }
    public String getSubject() {
        return subject;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    public ArrayList<String> getCc() {
        return cc;
    }

    public ArrayList<String> getBcc() {
        return bcc;
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public ArrayList<Attachment> getAttachments() {
        return this.Attachments;
    }

    public int getPriority() {
        return priority;
    }

    public int getMailID() {
        return mailID;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

//    public void setLocalDate(LocalDate localDate) {
//        this.localDate = localDate;
//    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = LocalDate.now();
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = LocalTime.now();
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

//    public void setLocalTime(LocalTime localTime) {
//        this.localTime = localTime;
//    }

    public String getMailType() {
        return mailType;
    }



    public Mail build(){
        return new Mail(this);
    }

}
