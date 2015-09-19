package com.adithya.bean;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */
public class InboxMessage {
    private String subject;
    private String image;

    public InboxMessage(String subject, String image) {
        this.subject = subject;
        this.image = image;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
