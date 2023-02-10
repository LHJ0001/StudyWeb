package com.example.studyweb.service;

import com.example.studyweb.pojo.Userlearn;

public interface Userlearnservice {
    Userlearn FindbyId(String id);
   void AddTag1(String id);
   void AddTag2(String id);
   void AddTag3(String id);
}
