package com.example.studyweb.mapper;

import com.example.studyweb.pojo.TestChoose;
import com.example.studyweb.pojo.TestJudge;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestJudgemapper {
    List<TestJudge> FindbyBoth(String id, String unit);
    void Fillanswerj(String id,String titlej,String item);
}
