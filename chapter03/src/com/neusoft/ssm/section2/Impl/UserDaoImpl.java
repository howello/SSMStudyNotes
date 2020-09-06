package com.neusoft.ssm.section2.Impl;

import com.neusoft.ssm.section2.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
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
