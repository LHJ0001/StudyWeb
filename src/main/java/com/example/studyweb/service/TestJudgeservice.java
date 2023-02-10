package com.example.studyweb.service;

import com.example.studyweb.pojo.TestChoose;
import com.example.studyweb.pojo.TestJudge;

import java.util.List;

public interface TestJudgeservice {
    List<TestJudge> FindbyBoth(String id, String unit);
    void Fillanswerj(String id,String titlej,String item);
}
