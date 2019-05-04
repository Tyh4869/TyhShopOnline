package com.tyh.shop.controller;

import com.tyh.shop.entity.User;
import com.tyh.shop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据openId获取用户信息
     *
     * @param id
     * @return
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public User getUserInfo(@PathVariable("id") Integer id) {
        return userService.queryUserById(id);
    }
}
