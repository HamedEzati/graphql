package com.hamed.graphql.graphql;

import com.hamed.graphql.dal.entity.Author;
import com.hamed.graphql.dal.entity.Post;
import com.hamed.graphql.graphql.dto.AuthorOutputModel;
import com.hamed.graphql.graphql.dto.PostInputModel;
import com.hamed.graphql.graphql.dto.PostOutputModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GraphQLMapper {
    PostOutputModel getPostOutputModelFromPost(Post post);

    Post getPostFromPostInputModelAndAuthorId(PostInputModel postInputModel, String authorId);

    AuthorOutputModel getAuthorOutputModelFromAuthor(Author author);
}
