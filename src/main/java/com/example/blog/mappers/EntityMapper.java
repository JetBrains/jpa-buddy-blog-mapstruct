package com.example.blog.mappers;

import org.mapstruct.*;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);

    List<E> toEntity(List<D> dto);
    List<E> toDto(List<D> entity);

    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget E entity, D dto);
}
