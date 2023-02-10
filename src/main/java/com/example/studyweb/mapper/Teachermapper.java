package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Teachermapper {
    Teacher FindbyId(String id);
}
