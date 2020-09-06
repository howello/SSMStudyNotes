package com.neusoft.ssm.section3.AnnotationInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    private static ApplicationContext context;

    public static void main(String[] args) {
        String xmlPath = "beans.xml";
        context = new ClassPathXmlApplicationContext(xmlPath);

        UserController controller = (UserController) context.getBean("userController");
        controller.run();

        System.out.println("-----------------------------------------------------------");

        String xml2Path = "beans2.xml";
        context = new ClassPathXmlApplicationContext(xml2Path);

        controller = (UserController) context.getBean("userController");
        controller.run();
    }
}
