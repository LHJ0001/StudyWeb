package com.example.studyweb.service;

import com.example.studyweb.mapper.TestChoosemapper;
import com.example.studyweb.pojo.TestChoose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestChooseserviceImpl implements TestChooseservice{
    @Autowired
    private TestChoosemapper testChoosemapper;
    @Override
    public List<TestChoose> FindbyBoth(String id, String unit) {
       List<TestChoose>testChooseList =testChoosemapper.FindbyBoth(id,unit);
       return testChooseList;
    }

    @Override
    public void Fillanswer(String id, String titlec, String item) {
        testChoosemapper.Fillanswer(id,titlec,item);
    }
}
