package com.example.studyweb.pojo;

public class Knowledge {
 private String id;
 private String unit;
 private String knowtitle;
 private String content;
 private int knowstate;
 private float difficulty;
 private String code;
 private int tag;

    public Knowledge(String id, String unit, String knowtitle, String content, int knowstate, float difficulty, String code, int tag) {
        this.id = id;
        this.unit = unit;
        this.knowtitle = knowtitle;
        this.content = content;
        this.knowstate = knowstate;
        this.difficulty = difficulty;
        this.code = code;
        this.tag = tag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getKnowtitle() {
        return knowtitle;
    }

    public void setKnowtitle(String knowtitle) {
        this.knowtitle = knowtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getKnowstate() {
        return knowstate;
    }

    public void setKnowstate(int knowstate) {
        this.knowstate = knowstate;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
