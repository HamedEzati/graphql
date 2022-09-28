package com.hamed.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hamed.graphql.dal.entity.Post;
import com.hamed.graphql.graphql.dto.PostInputModel;
import com.hamed.graphql.graphql.dto.PostOutputModel;
import com.hamed.graphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Component
@RequiredArgsConstructor
@Validated
public class PostMutationResolver implements GraphQLMutationResolver {

    private final PostService postService;
    private final GraphQLMapper mapper;

    public PostOutputModel writePost(@Valid PostInputModel postInputModel) {
        Post post = mapper.getPostFromPostInputModelAndAuthorId(postInputModel, getAuthorId());
        post = postService.create(post);
        return mapper.getPostOutputModelFromPost(post);
    }

    // TODO: 28.09.22 getting author id from context after adding security
    private String getAuthorId(){
        return "hamed-id";
    }

}
