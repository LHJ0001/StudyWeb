package com.example.studyweb.service;

import com.example.studyweb.mapper.Relymapper;
import com.example.studyweb.pojo.Rely;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RelyserviceImpl implements Relyservice{
    @Autowired
    private Relymapper relymapper;
    @Override
    public List<Rely> Findbyknowtitle(String id,String knowtitle) {
        List<Rely>relyList=relymapper.Findbyknowtitle(id,knowtitle);
        return relyList;
    }
}
