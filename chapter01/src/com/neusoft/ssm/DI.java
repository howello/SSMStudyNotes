package com.neusoft.ssm;

import com.neusoft.ssm.Dao.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DI {
    public static void main(String[] args) {

        //1、初始化容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.mapper");
        //2、通过容器获取UserService实例
        UserService userService = (UserService) applicationContext.getBean("userService");
        //3、调用里面的run方法
        userService.run();
    }
}
