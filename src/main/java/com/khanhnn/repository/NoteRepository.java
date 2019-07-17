package com.khanhnn.repository;


import com.khanhnn.model.Note;
import com.khanhnn.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note, Long> {
    Page<Note> findAllByTitleContaining(String title, Pageable pageable);

    Iterable<Note> findAllByType(Type type);
}
