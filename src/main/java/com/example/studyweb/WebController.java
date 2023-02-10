package com.example.studyweb;


import com.example.studyweb.service.Userlearnservice;
import com.example.studyweb.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;


@Controller
public class WebController {
    private static final Logger log= LoggerFactory.getLogger(WebController.class);
    @Autowired
    private Userservice userservice;
    @Autowired
    private Userlearnservice userlearnservice;
    @RequestMapping("/signin")
    public String signin(){
        return "signin";
    }
    @RequestMapping("/signup")
    public String signup(){

        return "signup";
    }
    @RequestMapping("/")
    public String Default(){

        return "signin";
    }
    @RequestMapping("/ix")

    public String Ix(
            @RequestParam() String email,
            String password,
            Model model
    ){

        if(!StringUtils.isEmpty(email) && "123456".equals(password)){
            model.addAttribute("username1","email");

            return "redirect:/dashboard";
        }
        else{
            model.addAttribute("msg","用户名或密码错误");
            return "signin";
        }
    }


    @RequestMapping("/dashboard-profile")
    public String dashboard_profile(){

        return "dashboard-profile";
    }



    @RequestMapping("/note")
    public String note(){

        return "note";
    }
    @RequestMapping("/notedetail")
    public String notetail(){

        return "notedetail";
    }

    @RequestMapping("/writenote")
    public String writenote(){

        return "writenote";
    }

}
