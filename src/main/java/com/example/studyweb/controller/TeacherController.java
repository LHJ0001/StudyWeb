package com.example.studyweb.controller;

import com.example.studyweb.pojo.*;
import com.example.studyweb.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TeacherController {
    private static final Logger log= LoggerFactory.getLogger(TeacherController.class);
    @Autowired
    private Teacherserrvice teacherserrvice;
    @Autowired
    private TestFillservice testFillservice;
    @Autowired
    private TestCodeservice testCodeservice;
    @Autowired
    private TestChooseservice testChooseservice;
    @Autowired
    private TestJudgeservice testJudgeservice;
    @RequestMapping("/teachersignin")
    public String teachersignin(){

        return "teachersignin";
    }
    @RequestMapping("/teacherpost")
    public String teacherpost(String id, String password, Model model){
        try {
            Teacher Teacher=teacherserrvice.login(id,password);
        }
        catch (Exception e)
        {
            model.addAttribute("msg","id或密码错误");
            e.printStackTrace();
            return "teachersignin";
        }
        return "redirect:/teachertables";
    }
    @RequestMapping("/teachertables")
    public String teachertables(Model model){
        List<TestFill> testFillList=testFillservice.Findall();
        model.addAttribute("testFillList",testFillList);
        List<TestCode> testCodeList=testCodeservice.Findall();
        model.addAttribute("testCodeList",testCodeList);
        return "teachertables";
    }
    @RequestMapping("/teachercheck")
    public String teachercheck(String id,String ftitle,String fanswerright,Model model){
        model.addAttribute("id",id);
        model.addAttribute("ftitle",ftitle);
        model.addAttribute("fanswerright",fanswerright);
        return "teachercheck";
    }

    @RequestMapping("/teachercheckcode")
    public String teachercheckcode(String id,String codetitle,String answerright,Model model){
        model.addAttribute("id",id);
        model.addAttribute("codetitle",codetitle);
        model.addAttribute("answerright",answerright);
        return "teachercheckcode";
    }
    @RequestMapping("/searchchoose")
    public String searchchoose(){
        return "searchchoose";
    }
    @RequestMapping("/searchjudge")
    public String searchjudge(){
        return "searchjudge";
    }
    @RequestMapping("/searchchoosepost")
    public String searchchoosepost(String id,String unit,Model model){
        List<TestChoose>testChooseList=testChooseservice.FindbyBoth(id,unit);
        int size=testChooseList.size();
        int right=0;
        for(int i=0;i<size;i++){
            if(testChooseList.get(i).getAnswer().equals(testChooseList.get(i).getAnswerright())){
                right=right+1;
            }
        }
        model.addAttribute("size",size);
        model.addAttribute("right",right);
        model.addAttribute("id",id);
        model.addAttribute("unit",unit);
        return "searchshow";
    }
    @RequestMapping("/searchjudgepost")
    public String searchjudgepost(String id,String unit,Model model){
        List<TestJudge>testJudgeList=testJudgeservice.FindbyBoth(id,unit);
        int size=testJudgeList.size();
        int right=0;
        for(int i=0;i<size;i++){
            if(testJudgeList.get(i).getAnswer().equals(testJudgeList.get(i).getAnswerright())){
                right=right+1;
            }
        }
        model.addAttribute("size",size);
        model.addAttribute("right",right);
        model.addAttribute("id",id);
        model.addAttribute("unit",unit);
        return "searchshow";
    }
}

