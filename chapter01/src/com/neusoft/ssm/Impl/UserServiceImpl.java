package com.neusoft.ssm.Impl;

import com.neusoft.ssm.Dao.UserDao;
import com.neusoft.ssm.Dao.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run() {
        this.userDao.login();
        System.out.println("UserService RUN!!!!!!!");
    }
}
