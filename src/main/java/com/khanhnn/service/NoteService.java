package com.khanhnn.service;

import com.khanhnn.model.Note;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NoteService {

    Page<Note> findAllByTitleContaining(String title, Pageable pageable);

    Page<Note> findAll(Pageable pageable);

    Note findById(Long id);

    void save(Note note);

    void remove(Long id);
}
