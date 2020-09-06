package com.neusoft.ssm.Dao;

import com.neusoft.ssm.Bean.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);

    public User getUserById(int id);

    public List<User> getAllUser();
}
