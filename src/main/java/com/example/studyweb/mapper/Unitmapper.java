package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Unit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Unitmapper {
List<Unit> FindbyId(String id);
List<Unit> FindbyIdFinish(String id);
List<Unit> FindbyIdUnfinish(String id);
void Update(String unitname);
void Updatenum(@Param("num") int num, @Param("id") String id, @Param("unitname") String unitname);
}
