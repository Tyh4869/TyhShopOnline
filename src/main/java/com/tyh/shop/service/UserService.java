package com.tyh.shop.service;

import com.tyh.shop.entity.User;

public interface UserService {

    User queryUserById(int id);

    User queryUserByName(String name);

    int addUser(User user);
}
