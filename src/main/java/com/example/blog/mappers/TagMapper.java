package com.example.blog.mappers;

import com.example.blog.dtos.TagDto;
import com.example.blog.entities.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TagMapper extends EntityMapper<TagDto, Tag> {
}