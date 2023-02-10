package com.example.studyweb.mapper;

import com.example.studyweb.pojo.TestFill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestFillmapper {
    List<TestFill> FindbyBoth(String id,String unit);
    void Fillanswerf(String id,String titlef,String filltext);
    List<TestFill> Findall();
}
