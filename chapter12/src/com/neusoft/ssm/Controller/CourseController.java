package com.neusoft.ssm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

    @GetMapping("/delete")
    public String delete() {
        return "course";
    }

    @PostMapping("/delete")
    public String delete(Integer[] ids) {
        if (ids != null) {
            for (Integer id : ids) {
                System.out.println("蒋政权牛逼，删除了" + id + "号书");
            }
        } else {
            System.out.println("空的");
        }
        return "success";
    }
}
