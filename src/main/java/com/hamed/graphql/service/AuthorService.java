package com.hamed.graphql.service;

import com.hamed.graphql.dal.entity.Author;

public interface AuthorService {

    Author getById(String id);

}
