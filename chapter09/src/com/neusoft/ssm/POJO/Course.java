package com.neusoft.ssm.POJO;

import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private String code;
    private List<Student> studentList;

    public Course() {
    }

    public Course(Integer id, String name, String code, List<Student> studentList) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.studentList = studentList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
