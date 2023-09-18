package com.example.springdemo.service;

import com.example.springdemo.dao.UserRepository;
import com.example.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    UserRepository userRepository;
    public UserDetails getUser(String username) {

        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw  new UsernameNotFoundException("User dose not exit");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),authorities);
    }
}
