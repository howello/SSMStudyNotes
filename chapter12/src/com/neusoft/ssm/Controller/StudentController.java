package com.neusoft.ssm.Controller;

import com.neusoft.ssm.POJO.Banji;
import com.neusoft.ssm.POJO.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Banji banji) {
        List<Student> students = banji.getStudentList();

        for (Student stu : students) {
            System.out.println(stu);
        }
        return "success";
    }
}
