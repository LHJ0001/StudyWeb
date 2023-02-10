package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Knowledge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Knowledgemapper {
    List<Knowledge> FindbyBoth(String id,String unitname);
    Knowledge FindbyTitle(String knowtitle,String id);
    void Updata(String knowtitle,String id);
    List<Knowledge> Findbytag(@Param("id") String id,@Param("tag") int tag);
}
