package com.example.blog.mappers;

import com.example.blog.dtos.PostDto;
import com.example.blog.entities.User;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<PostDto.UserDto,User> {
}