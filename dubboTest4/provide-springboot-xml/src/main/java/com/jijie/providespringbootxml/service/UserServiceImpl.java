package com.jijie.providespringbootxml.service;

import com.jijie.service.IUserService;

/**
 * <p>Description: </p>
 *
 * @author jijie
 * @Date 2021/5/17 11:11
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "dubbo+springboot";
    }
}
