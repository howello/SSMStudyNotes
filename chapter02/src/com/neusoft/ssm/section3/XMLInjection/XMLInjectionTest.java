package com.neusoft.ssm.section3.XMLInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLInjectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }
}
