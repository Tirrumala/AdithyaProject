package com.adithya.bean;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */
public class SubscribeTitleBean {
    private String title;
    private String category;
    private String subCategory;
    private String place;
    private String keywords;

    public SubscribeTitleBean(String title, String category, String subCategory, String place, String keywords) {
        this.title = title;
        this.category = category;
        this.subCategory = subCategory;
        this.place = place;
        this.keywords = keywords;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "SubscribeTitleBean{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", place='" + place + '\'' +
                ", keywords='" + keywords + '\'' +
                '}';
    }
}
