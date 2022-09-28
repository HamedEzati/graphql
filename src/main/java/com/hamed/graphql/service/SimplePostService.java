package com.hamed.graphql.service;

import com.hamed.graphql.dal.entity.Post;
import com.hamed.graphql.dal.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SimplePostService implements PostService {

    private final PostRepository repository;

    @Override
    public Post create(Post post) {
        return repository.save(post);
    }

    @Override
    public Post getById(String postId) {
        return repository.findById(postId).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Post> getList(int count, int offset) {
        return repository.findAll(PageRequest.of(offset, count)).getContent();
    }

    @Override
    public List<Post> getListByAuthorId(String authorId) {
        return repository.findAllByAuthorId(authorId);
    }
}
