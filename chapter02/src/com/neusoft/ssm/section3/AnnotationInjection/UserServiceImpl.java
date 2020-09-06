package com.neusoft.ssm.section3.AnnotationInjection;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run() {
        this.userDao.save();
        System.out.println("Service 跑起来了");
    }
}
