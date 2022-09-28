package com.hamed.graphql.dal.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Post {
    @Id
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
