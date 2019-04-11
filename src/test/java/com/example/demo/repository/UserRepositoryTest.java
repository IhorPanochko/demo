package com.example.demo.repository;

import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1 on 10.04.2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void findAllByAgeGreaterThan() throws Exception {

        List<User> expectedList=new ArrayList<>();

        List<User>actualList;

        User user=new User();
        user.setId(10L);
        user.setAge((byte)101);
        user.setName("Ihor");
        expectedList.add(user);

        actualList=userRepository.findAllByAgeGreaterThan((byte)100);

        Assert.assertEquals(expectedList.get(0).getName(),actualList.get(0).getName());
        Assert.assertEquals(expectedList.get(0).getAge(),actualList.get(0).getAge());

    }

}