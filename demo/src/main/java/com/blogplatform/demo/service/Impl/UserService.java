package com.blogplatform.demo.service.Impl;

import com.blogplatform.demo.service.IUserService;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public User getUser(String userId) {
        return null;
    }
}
