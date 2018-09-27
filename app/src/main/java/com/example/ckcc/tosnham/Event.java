package com.example.ckcc.tosnham;

/**
 * Created by CKCC on 9/25/2018.
 */

//for storing object event
public class Event
{
    private int id;
    private String title;
    private String imageUrl;
    private String date1;
    private String location;

    public Event(int id, String title, String imageUrl, String date1, String location) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.date1 = date1;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
