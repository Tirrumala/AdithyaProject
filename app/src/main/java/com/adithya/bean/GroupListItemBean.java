package com.adithya.bean;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */
public class GroupListItemBean {
    private String groupName;
    private String image;

    public GroupListItemBean(String groupName, String image) {
        this.groupName = groupName;
        this.image = image;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
