package com.example.studyweb.service;

import com.example.studyweb.mapper.Notemapper;
import com.example.studyweb.pojo.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NoteseerviceImpl implements Noteservice{
    @Autowired
    private Notemapper notemapper;
    @Override
    public List<Note> FindbyId(String id) {
      List<Note> notelist= notemapper.FindbyId(id);
      return notelist;
    }

    @Override
    public Note FindbyNotetitle(String notetitle) {
        Note note=notemapper.FindbyNotetitle(notetitle);
        return note;
    }

    @Override
    public void AddNote(Note note) {
        notemapper.AddNote(note);
    }
}
