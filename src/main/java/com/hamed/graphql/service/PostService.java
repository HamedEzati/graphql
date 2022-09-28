package com.hamed.graphql.service;

import com.hamed.graphql.dal.entity.Post;

import java.util.List;

public interface PostService {

    Post create(Post post);

    Post getById(String postId);

    List<Post> getList(int count, int offset);

    List<Post> getListByAuthorId(String authorId);

}
