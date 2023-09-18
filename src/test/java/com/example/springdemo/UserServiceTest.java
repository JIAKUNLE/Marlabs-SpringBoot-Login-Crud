package com.example.springdemo;

import com.example.springdemo.dao.UserRepository;
import com.example.springdemo.entity.User;
import com.example.springdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void testGetUserById() {
        User user = new User(1L, "testUser", "password");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> foundOptional = userService.getUserById(1L);

        assertTrue(foundOptional.isPresent()); // Check if the Optional contains a value
        User found = foundOptional.get();
        assertEquals(user.getUsername(), found.getUsername());
    }
}
