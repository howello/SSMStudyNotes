package com.neusoft.ssm.Impl;

import com.neusoft.ssm.Dao.UserDao;

public class UserDapImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("用户已登录");
    }
}
