package com.neusoft.ssm.Controller;

import com.neusoft.ssm.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @GetMapping("/toLogin")
    public String toLogin() {
        return "main";
    }

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();

        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        if (username != null && username.equalsIgnoreCase("1")) {
            if (password != null && password.equalsIgnoreCase("1")) {
                session.setAttribute("user_session", user);
                return "redirect:main";
            }
        }

        model.addAttribute("msg", "用户或者密码错误，请重新输入！");
        return "login";
    }

    @PostMapping("/ll")
    public String ll(User user) {
        System.out.println(user);
        return "success";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:toLogin";
    }
}
