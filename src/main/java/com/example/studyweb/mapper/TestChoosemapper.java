package com.example.studyweb.mapper;

import com.example.studyweb.pojo.TestChoose;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestChoosemapper {
    List<TestChoose> FindbyBoth(String id,String unit);
    void Fillanswer(String id,String titlec,String item);
}
