package com.hamed.graphql.dal.repository;

import com.hamed.graphql.dal.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findAllByAuthorId(String authorId);

}
