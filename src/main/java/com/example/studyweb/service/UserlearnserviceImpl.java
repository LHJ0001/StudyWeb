package com.example.studyweb.service;

import com.example.studyweb.mapper.Userlearnmapper;
import com.example.studyweb.mapper.Usermapper;
import com.example.studyweb.pojo.Userlearn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserlearnserviceImpl implements Userlearnservice{
    @Autowired
    private Userlearnmapper userlearnmapper;
    @Override
    public Userlearn FindbyId(String id) {
        Userlearn userlearn= userlearnmapper.FindbyId(id);
        return userlearn;
    }

    @Override
    public void AddTag1(String id) {
        userlearnmapper.AddTag1(id);
    }

    @Override
    public void AddTag2(String id) {
        userlearnmapper.AddTag2(id);
    }

    @Override
    public void AddTag3(String id) {
        userlearnmapper.AddTag3(id);
    }
}
