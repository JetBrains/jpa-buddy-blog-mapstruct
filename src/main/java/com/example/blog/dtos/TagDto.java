package com.example.blog.dtos;

import lombok.Value;

import java.io.Serializable;
import java.util.Set;


/**
 * DTO for {@link com.example.blog.entities.Tag}
 */
@Value
public class TagDto implements Serializable {
    Long id;
    String name;
    Set<PostDto> posts;
}