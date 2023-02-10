package com.example.studyweb.service;

import com.example.studyweb.mapper.Testmapper;
import com.example.studyweb.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TestserviceImpl implements Testservice{
    @Autowired
    private Testmapper testmapper;

    @Override
    public List<Test> FindbyIdunfinish(String id) {
        List<Test> testList=testmapper.FindbyIdunfinish(id);
        return testList;
    }

    @Override
    public List<Test> FindbyId(String id) {
        List<Test> testList=testmapper.FindbyId(id);
        return testList;
    }

    @Override
    public void Finishtest(String id, String unit,float score) {
        testmapper.Finishtest(id,unit,score);
    }

    @Override
    public void Updatedata(String id, String unit, Date date) {
        testmapper.Updatedata(id,unit,date);
    }
}
