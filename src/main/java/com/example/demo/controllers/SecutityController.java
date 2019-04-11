package com.example.demo.controllers;


import com.example.demo.entity.User;
import com.example.demo.secutity.JwtGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/token")
public class SecutityController {


    private JwtGenerator jwtGenerator;

    public SecutityController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final User jwtUser) {

        return jwtGenerator.generate(jwtUser);

    }
}
