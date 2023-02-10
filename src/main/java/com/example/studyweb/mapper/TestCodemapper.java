package com.example.studyweb.mapper;

import com.example.studyweb.pojo.TestCode;
import com.example.studyweb.pojo.TestFill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestCodemapper {
    List<TestCode> FindbyBoth(String id, String unit);
    void Fillanswerc(String id,String codetitle,String fillcode);
    List<TestCode> Findall();
}
