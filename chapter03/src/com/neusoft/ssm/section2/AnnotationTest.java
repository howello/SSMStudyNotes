package com.neusoft.ssm.section2;

import com.neusoft.ssm.section2.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.addUser();
    }
}
