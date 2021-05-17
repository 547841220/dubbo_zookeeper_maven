package com.jijie.providerspringbootannotation.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jijie.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * <p>Description: </p>
 *
 * @author jijie
 * @Date 2021/5/17 11:11
 */
@Component //表明这是一个spring组件，受spirng管理
@Service //发布dubbo服务
public class UserService implements IUserService {
    @Override
    public String hello() {
        return "springboot dubbo annotation";
    }
}
