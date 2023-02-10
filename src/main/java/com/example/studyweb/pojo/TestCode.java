package com.example.studyweb.pojo;

public class TestCode {
    private String id;
    private String unit;
    private String codetitle;
    private String answer;
    private String answerright;
    private int key;

    public TestCode(String id, String unit, String codetitle, String answer, String answerright, int key) {
        this.id = id;
        this.unit = unit;
        this.codetitle = codetitle;
        this.answer = answer;
        this.answerright = answerright;
        this.key = key;
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

    public String getCodetitle() {
        return codetitle;
    }

    public void setCodetitle(String codetitle) {
        this.codetitle = codetitle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerright() {
        return answerright;
    }

    public void setAnswerright(String answerright) {
        this.answerright = answerright;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
