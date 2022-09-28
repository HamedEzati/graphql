package com.hamed.graphql.graphql.dto;

import lombok.Data;

@Data
public class PostOutputModel {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
