package com.example.studyweb.service;

import com.example.studyweb.pojo.TestCode;
import com.example.studyweb.pojo.TestFill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface TestCodeservice {
    List<TestCode> FindbyBoth(String id, String unit);
    void Fillanswerc(String id,String codetitle,String fillcode);
    List<TestCode> Findall();
}
