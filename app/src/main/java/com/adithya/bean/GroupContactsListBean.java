package com.adithya.bean;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */
public class GroupContactsListBean {
    private String contactName;
    private String number;
    private String photo;

    public GroupContactsListBean(String contactName, String number, String photo) {
        this.contactName = contactName;
        this.number = number;
        this.photo = photo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
