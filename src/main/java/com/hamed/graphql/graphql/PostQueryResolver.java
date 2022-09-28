package com.hamed.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hamed.graphql.graphql.dto.PostOutputModel;
import com.hamed.graphql.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PostQueryResolver implements GraphQLQueryResolver {

    private final PostService postService;
    private final GraphQLMapper mapper;

    public List<PostOutputModel> getRecentPosts(int count, int offset){
        return postService.getList(count, offset).stream()
                .map(mapper::getPostOutputModelFromPost)
                .collect(Collectors.toList());
    }

    public PostOutputModel getPostById(String id){
        return mapper.getPostOutputModelFromPost(postService.getById(id));
    }

}
