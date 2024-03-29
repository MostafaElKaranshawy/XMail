package com.example.mail;

import java.io.Serializable;
import java.util.ArrayList;

public class DraftFolder implements MailFolders, Serializable {
    private ArrayList<Mail> draftMails;

    public DraftFolder() {
        this.draftMails = new ArrayList<>();
    }

    @Override
    public void addMail(Mail mail) {
        if(this.draftMails == null)this.draftMails = new ArrayList<Mail>();
        this.draftMails.add(mail);
    }

    @Override
    public ArrayList<Mail> getMail() {
        return this.draftMails;
    }

    public void setDraftMails(ArrayList<Mail> draftMails) {
        this.draftMails = draftMails;
    }

    @Override
    public ArrayList<Mail> deleteMail(Mail mail) {
        return this.draftMails;
    }
}
