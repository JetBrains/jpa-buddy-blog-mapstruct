package com.example.blog.mappers;

import com.example.blog.dtos.PostDto;
import com.example.blog.entities.Post;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PostMapper {
    Post toEntity(PostDto postDto);

    PostDto toDto(Post post);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Post partialUpdate(PostDto postDto, @MappingTarget Post post);
}