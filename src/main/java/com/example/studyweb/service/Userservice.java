package com.example.studyweb.service;

import com.example.studyweb.pojo.User;

public interface Userservice {
    void register(User user);
    User login(String email,String password);
    User FindById(String id);
    void update(User user);
    User FindbyUsername(String username);
    void Updatescore(String id,float sum);
}
