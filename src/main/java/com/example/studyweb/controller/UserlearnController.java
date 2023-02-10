package com.example.studyweb.controller;

import com.example.studyweb.pojo.Unit;
import com.example.studyweb.pojo.User;
import com.example.studyweb.service.Unitservice;
import com.example.studyweb.service.Userlearnservice;
import com.example.studyweb.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserlearnController {
    @Autowired
    private Userlearnservice userlearnservice;
    @Autowired
    private Unitservice unitservice;
    @Autowired
    private Userservice userservice;
    private static final Logger log= LoggerFactory.getLogger(UserController.class);
     @RequestMapping("/dashboard-all")
    public String dashboardall(String id,Model model){
         List<Unit> unitList=unitservice.FindbyId(id);
         User user=userservice.FindById(id);
         model.addAttribute(user);
         model.addAttribute("unitList",unitList);
          return "dashboard-all";
     }
     @RequestMapping("/dashboard-finish")
    public String dashboardfinish(String id,Model model){
         User user=userservice.FindById(id);
         model.addAttribute(user);
         List<Unit> unitList=unitservice.FindbyIdFinish(id);
         model.addAttribute("unitList",unitList);
         return "dashboard-finish";
     }
    @RequestMapping("/dashboard-unfinish")
    public String dashboardunfinish(String id,Model model){
        User user=userservice.FindById(id);
        model.addAttribute(user);
        List<Unit> unitList=unitservice.FindbyIdUnfinish(id);
        model.addAttribute("unitList",unitList);
        return "dashboard-unfinish";
    }
}
