package com.neusoft.ssm;

import com.neusoft.ssm.Dao.UserDao;
import com.neusoft.ssm.Dao.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ioc {
    public static void main(String[] args) {
        //1、初始化容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.mapper");
        //2、通过容器获取UserDao实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //3、通过实例调用方法
        userDao.login();
    }
}
