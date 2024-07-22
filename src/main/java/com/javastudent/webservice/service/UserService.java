package com.javastudent.webservice.service;

import com.javastudent.webservice.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);
}
