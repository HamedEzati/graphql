package com.hamed.graphql.graphql.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostInputModel {
    @NotBlank
    private String title;
    @NotBlank
    private String text;
    private String category;
}
