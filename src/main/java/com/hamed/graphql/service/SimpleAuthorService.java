package com.hamed.graphql.service;

import com.hamed.graphql.dal.entity.Author;
import com.hamed.graphql.dal.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleAuthorService implements AuthorService {

    private final AuthorRepository repository;

    @Override
    public Author getById(String id) {
        return repository.findById(id).orElse(new Author());
    }

}
