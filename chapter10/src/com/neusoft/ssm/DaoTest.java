package com.neusoft.ssm;

import com.neusoft.ssm.Dao.UserDao;
import com.neusoft.ssm.Mapper.UserMapper;
import com.neusoft.ssm.POJO.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void findUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUseByIdMapper() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
