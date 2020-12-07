package com.blogplatform.demo.service;

import org.apache.tomcat.jni.User;

public interface IUserService {
    User getUser(String userId);
}
