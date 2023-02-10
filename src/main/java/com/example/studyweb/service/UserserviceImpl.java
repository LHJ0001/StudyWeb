package com.example.studyweb.service;

import com.example.studyweb.mapper.Usermapper;
import com.example.studyweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.ObjectUtils;

@Service
@Transactional
public class UserserviceImpl implements Userservice {
    @Autowired
    private Usermapper usermapper;
    @Override
    public void register(User user) {
        User userdb=usermapper.findById(user.getId());
        if(userdb==null){
        usermapper.save(user);
        }
        else
            throw new RuntimeException("当前用户已被注册");
    }

    @Override
    public User login(String email, String password) {
       User user=usermapper.findByEmail(email);
       if(user==null)
       {
           throw new RuntimeException("用户名错误！");
       }
       else if(user.getPassword().equals(password)){
           return user;
       }
       else
           throw new RuntimeException("密码输入错误");

    }

    @Override
    public User FindById(String id) {
        User user=usermapper.findById(id);
        return user;
    }

    @Override
    public void update(User user) {
        usermapper.update(user);
    }

    @Override
    public User FindbyUsername(String username) {
       User user= usermapper.FindbyUsername(username);
        return user;
    }

    @Override
    public void Updatescore(String id, float sum) {
        usermapper.Updatescore(id,sum);
    }
}
