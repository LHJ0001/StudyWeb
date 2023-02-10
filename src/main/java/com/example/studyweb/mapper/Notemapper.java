package com.example.studyweb.mapper;

import com.example.studyweb.pojo.Note;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Notemapper {
    List<Note> FindbyId(String id);
    Note FindbyNotetitle(String notetitle);
    void AddNote(Note note);
}
