package com.example.hibernate;

import com.example.hibernate.Service.UserService;
import com.example.hibernate.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateApplication.class)
public class HibernateTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFind(){
        List<User> users = userService.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
