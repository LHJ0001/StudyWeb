package com.example.studyweb.pojo;

public class TestChoose {
private String id;
private String unit;
private String ctitle;
private String choosea;
private String chooseb;
private String choosec;
private String choosed;
private String answer;
private String answerright;

    public TestChoose(String id, String unit, String ctitle, String choosea, String chooseb, String choosec, String choosed, String answer, String answerright) {
        this.id = id;
        this.unit = unit;
        this.ctitle = ctitle;
        this.choosea = choosea;
        this.chooseb = chooseb;
        this.choosec = choosec;
        this.choosed = choosed;
        this.answer = answer;
        this.answerright = answerright;
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

    public String getCtitle() {
        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle;
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

    public String getChoosec() {
        return choosec;
    }

    public void setChoosec(String choosec) {
        this.choosec = choosec;
    }

    public String getChoosed() {
        return choosed;
    }

    public void setChoosed(String choosed) {
        this.choosed = choosed;
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
}
