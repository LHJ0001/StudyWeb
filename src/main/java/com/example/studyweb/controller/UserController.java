package com.example.studyweb.controller;

import com.example.studyweb.pojo.Note;
import com.example.studyweb.pojo.Test;
import com.example.studyweb.pojo.Userlearn;
import com.example.studyweb.mapper.Usermapper;
import com.example.studyweb.pojo.User;
import com.example.studyweb.service.Noteservice;
import com.example.studyweb.service.Testservice;
import com.example.studyweb.service.Userlearnservice;
import com.example.studyweb.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller

public class UserController {
    static String id123;
    private static final Logger log=LoggerFactory.getLogger(UserController.class);
    @Autowired
    private Userservice userservice;
    @Autowired
    private Userlearnservice userlearnservice;
    @Autowired
    private Testservice testservice;
    @Autowired
    private Noteservice noteservice;

    @RequestMapping("/register")
    public String register(User user,String checklist){

      log.debug("用户名:{},密码:{},确认密码:{}",user.getUsername(),user.getPassword(),checklist);
      if(user.getPassword().equals(checklist)){
          userservice.register(user);
          return "signin";}
      else

          return "signup";

    }

    @RequestMapping("/index")
    public String Index(String email, String password,HttpSession session ,Model model){
        log.debug("email:{},password:{}",email,password);
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        User user=userservice.login(email,password);
        id123=user.getId();
        session.setAttribute("user",user);
        session.setAttribute("date",date);

        }
        catch (Exception e)
        {
            model.addAttribute("msg","邮箱或密码错误");
            e.printStackTrace();
            return "signin";
        }
        return "redirect:/dashboard";
    }
    @RequestMapping("/dashboard")
    public String dashboard(Model model){
        User user=userservice.FindById(id123);
        model.addAttribute(user);
    Userlearn userlearn=userlearnservice.FindbyId(id123);
    List<Test> testList=testservice.FindbyIdunfinish(id123);
    model.addAttribute("userlearn",userlearn);
    model.addAttribute("testList",testList);
        return "dashboard";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/signin";
    }
    @RequestMapping("/dashboard-profileload")
    public String dashload(String id,Model model){
        User user1=userservice.FindById(id123);
        model.addAttribute("user1",user1);
        log.debug("查询当前id:{}",id);
        User user=userservice.FindById(id);
        model.addAttribute("user",user);
        return "/dashboard-profile";


    }
    @RequestMapping("/update")
    public String update(User user){
        log.debug("查询当前id123:{}{}{}{}{}",user.getUsername(),user.getId(),user.getEmail(),user.getPhone(),user.getSpeciality());
        userservice.update(user);
        return "redirect:/dashboard";
    }
    @RequestMapping("/writenotepost")
    public String writenotepost(String notetitle,String unit,String abstract1,String content){
        Date time=new Date();
        Note note=new Note(notetitle,unit,time,content,id123,abstract1);
        noteservice.AddNote(note);
        return "dashboard";
    }

}