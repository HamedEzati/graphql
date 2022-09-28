package com.hamed.graphql;

import com.hamed.graphql.dal.entity.Author;
import com.hamed.graphql.dal.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class Initializer {

    private final AuthorRepository authorRepository;

    @PostConstruct
    public void init(){
        boolean isEmpty = authorRepository.findById("hamed-id").isEmpty();
        if (isEmpty){
            Author author = new Author();
            author.setId("hamed-id");
            author.setName("hamed");
            authorRepository.save(author);
        }
    }
}
