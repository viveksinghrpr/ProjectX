package com.blogplatform.demo.dao.repository;

import com.blogplatform.demo.dao.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    User getUser(String userId);
}
