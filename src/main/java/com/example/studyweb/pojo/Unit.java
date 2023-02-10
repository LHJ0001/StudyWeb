package com.example.studyweb.pojo;

public class Unit {
    private String id;
    private int allpoint;
    private int finishpoint;
    private int finishstate;
    private String unit;
    private String unittitle;

    public Unit(String id, int allpoint, int finishpoint, int finishstate, String unit, String unittitle) {
        this.id = id;
        this.allpoint = allpoint;
        this.finishpoint = finishpoint;


        this.finishstate = finishstate;
        this.unit = unit;
        this.unittitle = unittitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAllpoint() {
        return allpoint;
    }

    public void setAllpoint(int allpoint) {
        this.allpoint = allpoint;
    }

    public int getFinishpoint() {
        return finishpoint;
    }

    public void setFinishpoint(int finishpoint) {
        this.finishpoint = finishpoint;
    }

    public int getFinishstate() {
        return finishstate;
    }

    public void setFinishstate(int finishstate) {
        this.finishstate = finishstate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnittitle() {
        return unittitle;
    }

    public void setUnittitle(String unittitle) {
        this.unittitle = unittitle;
    }
}
