package com.myblog.mangojuice.model;

public class BlogContent {
    private String auther;
    private String time;
    private String contect;

    public BlogContent() {
    }

    public BlogContent(String auther, String time, String contect) {
        this.auther = auther;
        this.time = time;
        this.contect = contect;
    }
    public String getAuther() {
        return auther;
    }

    public String getTime() {
        return time;
    }

    public String getContect() {
        return contect;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }
}
