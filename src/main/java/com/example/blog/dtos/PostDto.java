package com.example.blog.dtos;

import com.example.blog.entities.Post;
import com.example.blog.entities.User;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link Post}
 */
@Value
public class PostDto implements Serializable {
    String title;
    String content;
    Instant publishedAt;
    UserDto author;
    Integer upvote;

    /**
     * DTO for {@link User}
     */
    @Value
    public static class UserDto implements Serializable {
        Long id;
        String firstName;
        String lastName;
        String email;
        String fax;
    }
}