package com.example.demo.controllers;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.enums.Color;
import com.example.demo.enums.ColorName;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1 on 09.04.2019.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

     @GetMapping("api/users/get/{age}")
     public ResponseEntity<List<UserDto>>getUsersOlderThan(@PathVariable Byte age){
         HttpHeaders responseHeaders = new HttpHeaders();
         return ResponseEntity.ok().headers(responseHeaders).body(userService.getAllUserOlderThan(age));
     }

    @GetMapping("api/users/get")
    public ResponseEntity<List<User>>distinctUsersNames(){
        HttpHeaders responseHeaders = new HttpHeaders();
        return ResponseEntity.ok().headers(responseHeaders).body(userService.distinctUsersNames());
    }

    @GetMapping("api/users/getByArticleColor/{color}")
    public ResponseEntity<List<UserDto>> getByArticleColor(@PathVariable String color){
    HttpHeaders responseHeaders = new HttpHeaders();
    return ResponseEntity.ok().headers(responseHeaders).body(userService.usersByArticleColor(Color.getColor(ColorName.valueOf(color.toUpperCase()))));
}
    @PostMapping("api/user/add")
    public ResponseEntity<?>addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
        return new ResponseEntity<Void>(HttpStatus.OK);

}

}
