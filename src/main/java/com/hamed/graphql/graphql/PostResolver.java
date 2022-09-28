package com.hamed.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hamed.graphql.graphql.dto.AuthorOutputModel;
import com.hamed.graphql.graphql.dto.PostOutputModel;
import com.hamed.graphql.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostResolver implements GraphQLResolver<PostOutputModel> {

    private final AuthorService authorService;
    private final GraphQLMapper mapper;

    public AuthorOutputModel getAuthor(PostOutputModel postOutputModel) {
        return mapper.getAuthorOutputModelFromAuthor(authorService.getById(postOutputModel.getAuthorId()));
    }

}
