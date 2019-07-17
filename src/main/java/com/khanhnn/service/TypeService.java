package com.khanhnn.service;

import com.khanhnn.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Page<Type> findAll(Pageable pageable);

    Type findById(Long id);

    void save(Type type);

    void remove(Long id);

}
