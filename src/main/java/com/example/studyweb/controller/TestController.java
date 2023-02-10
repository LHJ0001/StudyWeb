package com.example.studyweb.controller;

import com.example.studyweb.pojo.*;
import com.example.studyweb.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class TestController {
    String id1;
    String unit1;

    private static final Logger log= LoggerFactory.getLogger(KnowledgeController.class);
    @Autowired
    private Testservice testservice;
    @Autowired
    private TestFillservice testFillservice;
    @Autowired
    private TestChooseservice testChooseservice;
    @Autowired
    private Userservice userservice;
    @Autowired
    private TestJudgeservice testJudgeservice;
    @Autowired
    private TestCodeservice testCodeservice;
   @RequestMapping("/mytest")
    public String mytest(String id, Model model){
       User user=userservice.FindById(id);
       model.addAttribute(user);
       List<Test>testList=testservice.FindbyId(id);
       model.addAttribute("testList",testList);
       return "mytest";
   }


    @RequestMapping("/preall")
    public String preall(String id,String unit,Model model){
        id1=id;
        unit1=unit;
        model.addAttribute("unit",unit);
       return "all";
    }
    @RequestMapping("/setanswer")
    public String setanswer(){
        float score;
        float sum=0;
        int j;
        Random r = new Random();
        j=r.nextInt(100);
        score=(float)j;
        testservice.Finishtest(id1,unit1,score);
        List<Test>testList=testservice.FindbyId(id1);
        for(int i=0;i<testList.size();i++){
            sum=sum+ testList.get(i).getScore();
        }
        sum=sum/testList.size();
        userservice.Updatescore(id1,sum);
        Date date1 = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        testservice.Updatedata(id1,unit1,date1);
        return "redirect:/dashboard";
    }

   int choosesize=0;
   int fillanswer=0;
   int judgesize=0;
   int codesize=0;
    @RequestMapping("/testchoose")
    public String testchoose(Model model){
        List<TestChoose> testChooseList=testChooseservice.FindbyBoth(id1,unit1);
        TestChoose testChoose=testChooseList.get(choosesize);
        model.addAttribute("testChoose",testChoose);
        model.addAttribute("num",choosesize+1);
        model.addAttribute("total",testChooseList.size());
        log.debug("大小：{}",testChooseList.size());
        if(choosesize==testChooseList.size()-1){
            model.addAttribute("msg","已经是此题型最后一题，请转到其他题型或提交试卷");

        }
        else
        {
            choosesize=choosesize+1;

        }
        return "testchoose";
    }
    @RequestMapping("/testchoosepost")
    public String testchoosepost(String item,String titlec){
        log.debug("item:{},titlec:{}",item,titlec);
        testChooseservice.Fillanswer(id1,titlec,item);
        return "redirect:/testchoose";
    }
    @RequestMapping("/testfill")
    public String testfill(Model model){
        List<TestFill> testFillList=testFillservice.FindbyBoth(id1,unit1);
        TestFill testFill=testFillList.get(fillanswer);
        model.addAttribute("total",testFillList.size());
       model.addAttribute("testFill",testFill);
        model.addAttribute("num",fillanswer+1);
        log.debug("大小：{}",testFillList.size());
        if(fillanswer==testFillList.size()-1){
            model.addAttribute("msg","已经是此题型最后一题，再一次点击提交后转到下一种题型");
        }
        else
        {
            fillanswer=fillanswer+1;
        }
        return "testfill";
    }
    @RequestMapping("/testfillpost")
    public String testfillpost(String filltext,String titlef){
        log.debug("答案：{},题目：{}",filltext,titlef);
        testFillservice.Fillanswerf(id1,titlef,filltext);
        return "redirect:/testfill";
    }
    @RequestMapping("/testjudge")
    public String testjudge(Model model){
        List<TestJudge> testJudgeList=testJudgeservice.FindbyBoth(id1,unit1);
        TestJudge testJudge=testJudgeList.get(judgesize);
        model.addAttribute("total",testJudgeList.size());
        model.addAttribute("testJudge",testJudge);
        model.addAttribute("num",judgesize+1);
        log.debug("大小：{}",testJudgeList.size());
        if(judgesize==testJudgeList.size()-1){
            model.addAttribute("msg","已经是此题型最后一题，再一次点击提交后转到下一种题型");
        }
        else
        {
            judgesize=judgesize+1;
        }
        return "testjudge";
    }
    @RequestMapping("/testjudgepost")
    public String testjudgepost(String item,String titlej){
        log.debug("item:{},titlec:{}",item,titlej);
        testJudgeservice.Fillanswerj(id1,item,titlej);
        return "redirect:/testjudge";
    }
    @RequestMapping("/testcode")
    public String testcode(Model model){
        List<TestCode> testCodeList=testCodeservice.FindbyBoth(id1,unit1);
        TestCode testCode=testCodeList.get(codesize);
        model.addAttribute("total",testCodeList.size());
        model.addAttribute("testCode",testCode);
        model.addAttribute("num",codesize+1);
        log.debug("大小：{}",testCodeList.size());
        if(codesize==testCodeList.size()-1){
            model.addAttribute("msg","已经是此题型最后一题，再一次点击提交后转到下一种题型");
        }
        else
        {
            codesize=codesize+1;
        }
        return "testcode";
    }
    @RequestMapping("/testcodepost")
    public String testcodepost(String codetitle,String fillcode){
        log.debug("codetitle:{},fillcode:{}",codetitle,fillcode);
        testCodeservice.Fillanswerc(id1,codetitle,fillcode);
        return "redirect:/testcode";

    }
}
