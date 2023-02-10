package com.example.studyweb.service;

import com.example.studyweb.pojo.TestChoose;
import com.example.studyweb.pojo.TestFill;

import java.util.List;

public interface TestFillservice {
    List<TestFill> FindbyBoth(String id, String unit);
    void Fillanswerf(String id,String titlef,String filltext);
    List<TestFill> Findall();
}
