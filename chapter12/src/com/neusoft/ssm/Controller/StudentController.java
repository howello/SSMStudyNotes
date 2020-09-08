package com.neusoft.ssm.Controller;

import com.neusoft.ssm.POJO.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/search")
    public String search() {
        return "student";
    }

    @PostMapping("/search")
    public String search(Student student) {
        System.out.println(student);
        return "success";
    }
}
