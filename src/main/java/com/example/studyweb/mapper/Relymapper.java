package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Rely;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Relymapper {
    List<Rely> Findbyknowtitle(String id,String knowtitle);
}
