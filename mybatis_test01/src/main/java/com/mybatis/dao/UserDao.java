package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @Author j
 * @Date 2023/8/29 14:26
 * @Version 1.0
 */
public interface UserDao {
    List<User> findAll();

    User findByUid(int uid);
}
