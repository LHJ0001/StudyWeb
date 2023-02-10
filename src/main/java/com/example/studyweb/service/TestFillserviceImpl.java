package com.example.studyweb.service;

import com.example.studyweb.mapper.TestFillmapper;
import com.example.studyweb.pojo.TestChoose;
import com.example.studyweb.pojo.TestFill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestFillserviceImpl implements TestFillservice{
    @Autowired
   private TestFillmapper testFillmapper;

    @Override
    public List<TestFill> FindbyBoth(String id, String unit) {
        List<TestFill> testFillList=testFillmapper.FindbyBoth(id,unit);
        return testFillList;
    }

    @Override
    public void Fillanswerf(String id, String titlef, String filltext) {
        testFillmapper.Fillanswerf(id,titlef,filltext);
    }

    @Override
    public List<TestFill> Findall() {
        List<TestFill> testFillList=testFillmapper.Findall();
        return testFillList;
    }
}
