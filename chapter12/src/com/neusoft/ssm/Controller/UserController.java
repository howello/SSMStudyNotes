package com.neusoft.ssm.Controller;

import com.neusoft.ssm.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/select")
    public String selectUser(HttpServletRequest request) {
        String id = request.getParameter("id");
        System.out.println("ID:  " + id);
        return "success";
    }

    @GetMapping("/selectid")
    public String selectUser(Integer id) {
        System.out.println("ID:  " + id);
        return "success";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {
        System.out.println(user);
        return "success";
    }
}
