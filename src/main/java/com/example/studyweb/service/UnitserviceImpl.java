package com.example.studyweb.service;

import com.example.studyweb.mapper.Unitmapper;
import com.example.studyweb.pojo.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UnitserviceImpl implements Unitservice{
    @Autowired
    private Unitmapper unitmapper;
    @Override
    public List<Unit> FindbyId(String id) {
        List<Unit>unitList=unitmapper.FindbyId(id);
        return unitList;
    }

    @Override
    public List<Unit> FindbyIdFinish(String id) {
        List<Unit>unitList=unitmapper.FindbyIdFinish(id);
        return unitList;
    }

    @Override
    public List<Unit> FindbyIdUnfinish(String id) {
        List<Unit>unitList=unitmapper.FindbyIdUnfinish(id);
        return unitList;
    }

    @Override
    public void Update(String unitname) {
        unitmapper.Update(unitname);
    }

    @Override
    public void Updatenum(int num,String id,String unitname) {
        unitmapper.Updatenum(num,id,unitname);
    }
}
