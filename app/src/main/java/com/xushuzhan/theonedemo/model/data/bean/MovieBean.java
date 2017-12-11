package com.xushuzhan.theonedemo.model.data.bean;

/**
 * Created by xushuzhan on 2017/12/10.
 */

public class MovieBean {

    String PicUrl;
    String title;
    String content;
    String author;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public MovieBean(String picUrl, String title, String content, String author) {
        PicUrl = picUrl;
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
