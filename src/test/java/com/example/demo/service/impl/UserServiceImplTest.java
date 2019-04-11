package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;



@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest  {


    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UserRepository userRepository;


    @Test
    public void getAllUserOlderThan() throws Exception {


        List<User>expectedList=new ArrayList<>();

        List<User>actualList;

        User user=new User();
        user.setId(10L);
        user.setAge((byte)101);
        user.setName("Ihor");

       expectedList.add(user);

       actualList=userRepository.findAllByAgeGreaterThan((byte)100);

        Mockito.when(actualList).thenReturn(expectedList);

        Assert.assertEquals(expectedList.get(0).getAge(),userService.getAllUserOlderThan((byte)100).get(0).getAge());
        Assert.assertEquals(expectedList.get(0).getName(),userService.getAllUserOlderThan((byte)100).get(0).getName());


    }

}