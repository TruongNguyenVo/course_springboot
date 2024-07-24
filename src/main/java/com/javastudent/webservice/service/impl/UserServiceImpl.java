package com.javastudent.webservice.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.javastudent.webservice.dto.UserDto;
import com.javastudent.webservice.entity.User;
import com.javastudent.webservice.mapper.UserMapper;
import com.javastudent.webservice.repository.UserRepository;
import com.javastudent.webservice.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

        // User user = UserMapper.mapToUser(userDto);
        User user = modelMapper.map(userDto, User.class);


        User savedUser =  userRepository.save(user);

        //Convert User JPA Entity into UserDto
        // UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        UserDto savedUserDto = modelMapper.map(savedUser, UserDto.class);

        return savedUserDto;
    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<User> optionalUser =  userRepository.findById(userId);
        User user =  optionalUser.get();
        UserDto userDto = UserMapper.mapToUserDto(user);
        return userDto;
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(User user) {
        User exsittingUser = userRepository.findById(user.getId()).get();
        exsittingUser.setFirstName(user.getFirstName());
        exsittingUser.setLastName(user.getLastName());
        exsittingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(exsittingUser);

        return UserMapper.mapToUserDto(updatedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }




}
