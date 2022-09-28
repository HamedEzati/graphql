package com.hamed.graphql.dal.repository;

import com.hamed.graphql.dal.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {

}
