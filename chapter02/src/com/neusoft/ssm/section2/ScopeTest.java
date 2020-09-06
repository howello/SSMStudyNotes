package com.neusoft.ssm.section2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));

        System.out.println("--------------------------------------------------");

        System.out.println(applicationContext.getBean("scope2"));
        System.out.println(applicationContext.getBean("scope2"));
    }
}
