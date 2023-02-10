package com.example.studyweb.pojo;

public class Rely {
    private String id;
    private String old;
    private String rely;
    private int relyid;

    public Rely(String id, String old, String rely, int relyid) {
        this.id = id;
        this.old = old;
        this.rely = rely;
        this.relyid = relyid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getRely() {
        return rely;
    }

    public void setRely(String rely) {
        this.rely = rely;
    }

    public int getRelyid() {
        return relyid;
    }

    public void setRelyid(int relyid) {
        this.relyid = relyid;
    }
}
