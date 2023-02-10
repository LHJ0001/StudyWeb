package com.example.studyweb.service;

import com.example.studyweb.pojo.Note;

import java.util.List;

public interface Noteservice {
    List<Note> FindbyId(String id);
    Note FindbyNotetitle(String notetitle);
    void AddNote(Note note);
}
