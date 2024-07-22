package com.javastudent.webservice.service;

import java.util.List;

import com.javastudent.webservice.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUser();
}
