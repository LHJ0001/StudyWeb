package com.example.studyweb.pojo;

public class Userlearn {
private String id;
private int allunit;
private int finishunit;

private int tag1;
private int tag2;
private int tag3;

    public Userlearn(String id, int allunit, int finishunit, int tag1,int tag2,int tag3) {
        this.id = id;
        this.allunit = allunit;
        this.finishunit = finishunit;

        this.tag1=tag1;
        this.tag2=tag2;
        this.tag3=tag3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAllunit() {
        return allunit;
    }

    public void setAllunit(int allunit) {
        this.allunit = allunit;
    }

    public int getFinishunit() {
        return finishunit;
    }

    public void setFinishunit(int finishunit) {
        this.finishunit = finishunit;
    }


    public int getTag1() {
        return tag1;
    }

    public int getTag2() {
        return tag2;
    }

    public int getTag3() {
        return tag3;
    }

    public void setTag1(int tag1) {
        this.tag1 = tag1;
    }

    public void setTag2(int tag2) {
        this.tag2 = tag2;
    }

    public void setTag3(int tag3) {
        this.tag3 = tag3;
    }
}
