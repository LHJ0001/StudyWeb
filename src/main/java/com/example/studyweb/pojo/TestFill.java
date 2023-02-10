package com.example.studyweb.pojo;

public class TestFill {
    private String id;
    private String unit;
    private String ftitle;
    private String fanswer;
    private String fanswerright;

    public TestFill(String id, String unit, String ftitle, String fanswer, String fanswerright) {
        this.id = id;
        this.unit = unit;
        this.ftitle = ftitle;
        this.fanswer = fanswer;
        this.fanswerright = fanswerright;
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

    public String getFtitle() {
        return ftitle;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle;
    }

    public String getFanswer() {
        return fanswer;
    }

    public void setFanswer(String fanswer) {
        this.fanswer = fanswer;
    }

    public String getFanswerright() {
        return fanswerright;
    }

    public void setFanswerright(String fanswerright) {
        this.fanswerright = fanswerright;
    }
}
