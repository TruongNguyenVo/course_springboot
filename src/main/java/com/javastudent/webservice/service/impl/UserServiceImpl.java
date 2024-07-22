package com.javastudent.webservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastudent.webservice.entity.User;
import com.javastudent.webservice.repository.UserRepository;
import com.javastudent.webservice.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser =  userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User updateUser(User user) {
        User exsittingUser = userRepository.findById(user.getId()).get();
        exsittingUser.setFirstName(user.getFirstName());
        exsittingUser.setLastName(user.getLastName());
        exsittingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(exsittingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }




}
