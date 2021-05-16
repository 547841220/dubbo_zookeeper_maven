package com.jijie.service.impl;

import com.jijie.service.IUserService;


public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "hello,dubbo!";
    }
}
