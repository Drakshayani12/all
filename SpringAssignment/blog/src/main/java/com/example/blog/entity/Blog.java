package com.example.blog.entity;

public class Blog {
    private long id;
    private String title;
    private String content;
    private String information;
    public Blog(){}
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
    public Blog(long id,String title, String content, String information) {
        this.title = title;
        this.id = id;
        this.content = content;
        this.information = information;
    }
    @Override
    public String toString() {
        return "Blog [id=" + id + ", title=" + title + ", content=" + content + ", information=" + information + "]";
    }
   
}
