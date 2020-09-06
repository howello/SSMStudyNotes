package com.neusoft.ssm.section1.Impl;

import com.neusoft.ssm.section1.Dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("【执行】添加用户成功！");
    }

    @Override
    public void deleteUser() {
        System.out.println("【执行】删除用户成功！");
    }
}
