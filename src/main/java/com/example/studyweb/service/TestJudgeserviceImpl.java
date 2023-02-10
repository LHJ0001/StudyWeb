package com.example.studyweb.service;

import com.example.studyweb.mapper.TestJudgemapper;
import com.example.studyweb.pojo.TestJudge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestJudgeserviceImpl implements TestJudgeservice{
    @Autowired
    private TestJudgemapper testJudgemapper;
    @Override
    public List<TestJudge> FindbyBoth(String id, String unit) {
        List<TestJudge> testJudgeList= testJudgemapper.FindbyBoth(id,unit);
        return testJudgeList;
    }

    @Override
    public void Fillanswerj(String id, String titlej, String item) {
     testJudgemapper.Fillanswerj(id,titlej,item);
    }
}
