package com.tyh.shop.service.impl;

import com.tyh.shop.entity.User;
import com.tyh.shop.mapper.UserMapper;
import com.tyh.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
