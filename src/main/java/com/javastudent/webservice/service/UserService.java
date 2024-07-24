package com.javastudent.webservice.service;

import java.util.List;

import com.javastudent.webservice.dto.UserDto;
import com.javastudent.webservice.entity.User;

public interface UserService {
    UserDto createUser(UserDto user);

    User getUserById(Long userId);

    List<User> getAllUser();

    User updateUser(User user);

    void deleteUser(Long userId);
}
