package com.example.studyweb.mapper;

import com.example.studyweb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Usermapper {
    User findById(String Id);
    void save(User user);
    User findByEmail(String email);
    void update(User user);
    User FindbyUsername(String username);
    void Updatescore(@Param("id") String id,@Param("sum") float sum);

}
