package com.blogplatform.demo.controller;

import com.blogplatform.demo.dao.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/User")
public class UserController
{
    @GetMapping(value = "/profile")
    public User getUser(@PathVariable String userId)
    {

    }
}
