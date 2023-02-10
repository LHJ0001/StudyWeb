package com.example.studyweb.service;

import com.example.studyweb.pojo.Knowledge;

import java.util.List;

public interface Knowledgeservice {
    List<Knowledge> FindbyBoth(String id,String unitname);
    Knowledge FindbyTitle(String knowtitle,String id);
    void Updata(String knowtitle,String id);
    List<Knowledge> Findbytag(String id,int tag);
}
