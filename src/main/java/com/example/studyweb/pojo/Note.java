package com.example.studyweb.pojo;

import java.util.Date;

public class Note {
private String notetitle;
private String unit;
private Date time;
private String content;
private String id;
private String abstract1;

    public Note(String notetitle, String unit, Date time, String content, String id, String abstract1) {
        this.notetitle = notetitle;
        this.unit = unit;
        this.time = time;
        this.content = content;
        this.id = id;
        this.abstract1 = abstract1;
    }

    public String getNotetitle() {
        return notetitle;
    }

    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAbstract1() {
        return abstract1;
    }

    public void setAbstract1(String abstract1) {
        this.abstract1 = abstract1;
    }
}
