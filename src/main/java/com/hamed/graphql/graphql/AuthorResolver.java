package com.hamed.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hamed.graphql.graphql.dto.AuthorOutputModel;
import com.hamed.graphql.graphql.dto.PostOutputModel;
import com.hamed.graphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<AuthorOutputModel> {

    private final PostService postService;
    private final GraphQLMapper mapper;

    public List<PostOutputModel> getPosts(AuthorOutputModel authorOutputModel) {
        return postService.getListByAuthorId(authorOutputModel.getId()).stream()
                .map(mapper::getPostOutputModelFromPost)
                .collect(Collectors.toList());
    }

}
