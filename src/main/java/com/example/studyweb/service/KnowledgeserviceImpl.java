package com.example.studyweb.service;

import com.example.studyweb.mapper.Knowledgemapper;
import com.example.studyweb.pojo.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KnowledgeserviceImpl implements Knowledgeservice {
    @Autowired
    private Knowledgemapper knowledgemapper;
    @Override
    public List<Knowledge> FindbyBoth(String id, String unitname) {
        List<Knowledge> knowledgeList =knowledgemapper.FindbyBoth(id,unitname);
        return knowledgeList;
    }

    @Override
    public Knowledge FindbyTitle(String knowtitle,String id) {
        Knowledge knowledge=knowledgemapper.FindbyTitle(knowtitle,id);
        return knowledge;
    }

    @Override
    public void Updata(String knowtitle, String id) {
        knowledgemapper.Updata(knowtitle,id);
    }

    @Override
    public List<Knowledge> Findbytag(String id, int tag) {
        List<Knowledge>knowledgeList=knowledgemapper.Findbytag(id,tag);
        return knowledgeList;
    }
}
