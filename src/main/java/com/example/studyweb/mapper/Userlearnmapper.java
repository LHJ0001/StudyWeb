package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Userlearn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Userlearnmapper {
    Userlearn FindbyId(String id);
    void AddTag1(String id);
    void AddTag2(String id);
    void AddTag3(String id);
}
