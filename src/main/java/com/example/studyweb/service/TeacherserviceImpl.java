package com.example.studyweb.service;

import com.example.studyweb.mapper.Teachermapper;
import com.example.studyweb.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherserviceImpl implements Teacherserrvice{
    @Autowired
    private Teachermapper teachermapper;
    @Override
    public Teacher login(String id, String password) {
        Teacher teacher=teachermapper.FindbyId(id);
        if(teacher==null)
        {
            throw new RuntimeException("用户名错误！");
        }
        else if(teacher.getPassword().equals(password)){
            return teacher;
        }
        else
            throw new RuntimeException("密码输入错误");

    }
}
