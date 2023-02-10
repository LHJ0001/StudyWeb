package com.example.studyweb.pojo;

public class TestJudge {
    private String id;
    private String unit;
    private String jtitle;
    private String choosea;
    private String chooseb;
    private String answer;
    private String answerright;
    private int key;

    public TestJudge(String id, String unit, String jtitle, String choosea, String chooseb, String answer, String answerright, int key) {
        this.id = id;
        this.unit = unit;
        this.jtitle = jtitle;
        this.choosea = choosea;
        this.chooseb = chooseb;
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

    public String getJtitle() {
        return jtitle;
    }

    public void setJtitle(String jtitle) {
        this.jtitle = jtitle;
    }

    public String getChoosea() {
        return choosea;
    }

    public void setChoosea(String choosea) {
        this.choosea = choosea;
    }

    public String getChooseb() {
        return chooseb;
    }

    public void setChooseb(String chooseb) {
        this.chooseb = chooseb;
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
