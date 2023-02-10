package com.example.studyweb.controller;

import com.example.studyweb.pojo.Knowledge;
import com.example.studyweb.pojo.Rely;
import com.example.studyweb.pojo.User;
import com.example.studyweb.pojo.Userlearn;
import com.example.studyweb.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class KnowledgeController {
    private static final Logger log= LoggerFactory.getLogger(KnowledgeController.class);
    @Autowired
    private Knowledgeservice knowledgeservice;
    @Autowired
    private Unitservice unitservice;
    @Autowired
    private Userlearnservice userlearnservice;
    @Autowired
    private Relyservice relyservice;
    @Autowired
    private Userservice userservice;
    @RequestMapping("/moduList")
    public String Modulist(String id, String unitname,String unittitle,Model model){
        List<Knowledge> knowledgeList=knowledgeservice.FindbyBoth(id,unitname);
        int countall=0;
        int countknownum=0;
        for(Knowledge knowledge:knowledgeList){
          countall=countall+knowledge.getKnowstate();
          countknownum=countknownum+knowledge.getKnowstate();
        }
        unitservice.Updatenum(countknownum,id,unitname);
        if(countall==knowledgeList.size()){
            unitservice.Update(unitname);
        }
        User user=userservice.FindById(id);
        model.addAttribute(user);
        model.addAttribute("knowledgeList",knowledgeList);
        model.addAttribute("unittitle",unittitle);
        return "ModuList";
    }
    public String knowtitle1;
    public String id1;
    @RequestMapping("/knowledgeload")
    public String knowledgeload(String knowtitle,String id,Model model){
        id1=id;
        knowtitle1=knowtitle;
        List<Rely>relyList=relyservice.Findbyknowtitle(id,knowtitle);
        int count1=0;
        for(int i=0;i<relyList.size();i++){
            Knowledge knowledge=knowledgeservice.FindbyTitle(relyList.get(i).getRely(),id);
            count1=knowledge.getKnowstate()+count1;
        }
        if(count1==relyList.size())
        {
            User user=userservice.FindById(id);
            model.addAttribute(user);
       Knowledge knowledge=knowledgeservice.FindbyTitle(knowtitle,id);
       model.addAttribute("knowledge",knowledge);
       int tag1;
       int tag2;
       int tag3;
        Userlearn userlearn= userlearnservice.FindbyId(id);
        tag1=userlearn.getTag1();
        tag2= userlearn.getTag2();
        tag3=userlearn.getTag3();
        List<Knowledge>knowledgeList1;
        if(tag1>=tag2 && tag1>=tag3){
           knowledgeList1=knowledgeservice.Findbytag(id,1);
        }
        else if(tag2>=tag1 && tag2>=tag3)
        {
          knowledgeList1=knowledgeservice.Findbytag(id,2);
        }
        else
        {
            knowledgeList1=knowledgeservice.Findbytag(id,3);
        }
        for(int i=0;i<knowledgeList1.size();i++){
      if(knowledgeList1.get(i).getKnowtitle().equals(knowtitle)){
          knowledgeList1.remove(i);
          i--;
      }
        }
        model.addAttribute("knowledgeList1",knowledgeList1);
        return "knowledge";}
        else
        {
            return "redirect:tip";
        }
    }
    @RequestMapping("finishknowledge")
    public String finishknowledge(String title,String id,String unit,int tag){
        knowledgeservice.Updata(title,id);
        List<Knowledge> knowledgeList=knowledgeservice.FindbyBoth(id,unit);
        int countall=0;
        int countknownum=0;
        for(Knowledge knowledge:knowledgeList){
            countall=countall+knowledge.getKnowstate();
            countknownum=countknownum+knowledge.getKnowstate();
        }
        unitservice.Updatenum(countknownum,id,unit);
        if(countall==knowledgeList.size()){
            unitservice.Update(unit);
        }
        if(tag==1){
            userlearnservice.AddTag1(id);
        }
        else if(tag==2)
        {
            userlearnservice.AddTag2(id);
        }
        else if(tag==3){
            userlearnservice.AddTag3(id);}
        return "redirect:/dashboard";
    }
    @RequestMapping("tip")
    public String tip(Model model){
        List<Rely>relyList=relyservice.Findbyknowtitle(id1,knowtitle1);
        model.addAttribute("relyList",relyList);
        return "/tip";
    }
}
