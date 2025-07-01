package com.timo.mappers;

import com.timo.dtos.ProductDto;
import com.timo.dtos.RegisterUserRequest;
import com.timo.dtos.UpdateUserRequest;
import com.timo.entities.Product;
import com.timo.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto toDto(Product product);

    Product toEntity(ProductDto request);

    @Mapping(target = "id", ignore = true)
    void update(ProductDto request, @MappingTarget Product product);
}
