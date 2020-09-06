package com.neusoft.ssm.section3.AnnotationInjection;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        this.userService.run();
        System.out.println("Controller控制了");
    }
}
