package com.example.studyweb.service;

import com.example.studyweb.pojo.TestChoose;

import java.util.List;

public interface TestChooseservice {
    List<TestChoose> FindbyBoth(String id,String unit);
    void Fillanswer(String id,String titlec,String item);
}
