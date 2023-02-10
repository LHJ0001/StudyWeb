package com.example.studyweb.controller;

import com.example.studyweb.pojo.Note;
import com.example.studyweb.pojo.User;
import com.example.studyweb.service.Noteservice;
import com.example.studyweb.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Notecontroller {
            private static final Logger log= LoggerFactory.getLogger(Notecontroller.class);
    @Autowired
    private Noteservice noteservice;
    @Autowired
    private Userservice userservice;
    public String id1;
    @RequestMapping("/noteload")
    public String noteload(String id, Model model){
        id1=id;
        User user=userservice.FindById(id);
        model.addAttribute(user);
        List<Note> notelist=noteservice.FindbyId(id);
        log.debug("笔记信息:{}",notelist.get(0).getAbstract1());
        model.addAttribute("notelist",notelist);
        return "note";
    }
    @RequestMapping("/notedetailload")
    public String notedetailload(String notetitle,Model model){
        User user=userservice.FindById(id1);
        model.addAttribute(user);
        Note note1=noteservice.FindbyNotetitle(notetitle);
        log.debug("笔记详情:{}",note1.getAbstract1());
        model.addAttribute("note1",note1);
        return "notedetail";
    }
}
