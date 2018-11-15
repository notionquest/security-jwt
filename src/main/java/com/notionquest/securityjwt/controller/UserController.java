package com.notionquest.securityjwt.controller;

import com.notionquest.securityjwt.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(new User(UUID.randomUUID().toString(), "Hello", "World"));
    }
}
