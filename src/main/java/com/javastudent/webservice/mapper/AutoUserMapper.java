package com.javastudent.webservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.javastudent.webservice.dto.UserDto;
import com.javastudent.webservice.entity.User;

@Mapper
public interface AutoUserMapper {
    // @Mapping(source = "email", target = "emailAddress")

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
    UserDto mapToUserDto(User user);

    User maptoUser(UserDto userDto);

}
