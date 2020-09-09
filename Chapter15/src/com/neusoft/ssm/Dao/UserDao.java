package com.neusoft.ssm.Dao;

import com.neusoft.ssm.POJO.User;

public interface UserDao {
    public User findUserById(Integer id);
}
