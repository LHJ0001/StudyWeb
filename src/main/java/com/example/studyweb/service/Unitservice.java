package com.example.studyweb.service;

import com.example.studyweb.pojo.Unit;

import java.util.List;

public interface Unitservice {
    List<Unit> FindbyId(String id);
    List<Unit> FindbyIdFinish(String id);
    List<Unit> FindbyIdUnfinish(String id);
    void Update(String unitname);
    void Updatenum(int num,String id,String unitname);
}
