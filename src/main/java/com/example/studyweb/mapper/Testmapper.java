package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface Testmapper {
    List<Test> FindbyIdunfinish(String id);
    List<Test> FindbyId(String id);
    void Finishtest(@Param("id") String id, @Param("unit") String unit, @Param("score") float score);
    void Updatedata(@Param("id") String id, @Param("unit") String unit,@Param("date") Date date);
}
