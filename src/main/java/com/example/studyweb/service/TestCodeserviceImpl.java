package com.example.studyweb.service;

import com.example.studyweb.mapper.TestCodemapper;
import com.example.studyweb.pojo.TestCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestCodeserviceImpl implements TestCodeservice{
    @Autowired
    private TestCodemapper testCodemapper;
    @Override
    public List<TestCode> FindbyBoth(String id, String unit) {
        List<TestCode> testCodeList=testCodemapper.FindbyBoth(id,unit);
        return testCodeList;
    }

    @Override
    public void Fillanswerc(String id, String codetitle, String fillcode) {
       testCodemapper.Fillanswerc(id,codetitle,fillcode);
    }

    @Override
    public List<TestCode> Findall() {
       List<TestCode>testCodeList= testCodemapper.Findall();
        return testCodeList;
    }
}
