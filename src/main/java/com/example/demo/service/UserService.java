package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by 1 on 09.04.2019.
 */
public interface UserService {

    List<UserDto> getAllUserOlderThan(Byte age);

    List<User>distinctUsersNames();

    List<UserDto>usersByArticleColor(String color);

    void addUser(UserDto userDto);
}
