package com.example.studyweb.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

public class Test {
    private String id;
    private String unit;
    private int teststate;
    private int qcount;
    private String unittitle;
    private float score;
    private Date data;

    public Test(String id, String unit, int teststate, int qcount, String unittitle,float score,Date data) {
        this.id = id;
        this.unit = unit;
        this.teststate = teststate;
        this.qcount = qcount;
        this.unittitle = unittitle;
        this.score=score;
        this.data=data;
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

    public int getTeststate() {
        return teststate;
    }

    public void setTeststate(int teststate) {
        this.teststate = teststate;
    }

    public int getQcount() {
        return qcount;
    }

    public void setQcount(int qcount) {
        this.qcount = qcount;
    }

    public String getUnittitle() {
        return unittitle;
    }

    public void setUnittitle(String unittitle) {
        this.unittitle = unittitle;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
