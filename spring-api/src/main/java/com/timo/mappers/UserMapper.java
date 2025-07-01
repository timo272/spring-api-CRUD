package com.timo.mappers;

import com.timo.dtos.RegisterUserRequest;
import com.timo.dtos.UpdateUserRequest;
import com.timo.dtos.UserDto;
import com.timo.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
