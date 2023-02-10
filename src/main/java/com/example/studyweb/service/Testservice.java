package com.example.studyweb.service;

import com.example.studyweb.pojo.Test;

import java.util.Date;
import java.util.List;

public interface Testservice {
    List<Test> FindbyIdunfinish(String id);
    List<Test> FindbyId(String id);
    void Finishtest(String id,String unit,float score);
    void Updatedata(String id, String unit, Date date);
}
