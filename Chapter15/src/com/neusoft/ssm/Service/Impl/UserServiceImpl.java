package com.neusoft.ssm.Service.Impl;

import com.neusoft.ssm.Dao.UserDao;
import com.neusoft.ssm.POJO.User;
import com.neusoft.ssm.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        return this.userDao.findUserById(id);
    }
}
