package com.neusoft.ssm.POJO;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private String sex;
    private StudentCard studentCard;
    private List<Course> courseList;

    public Student() {
    }

    public Student(String name, String sex, StudentCard studentCard, List<Course> courseList) {
        this.name = name;
        this.sex = sex;
        this.studentCard = studentCard;
        this.courseList = courseList;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StudentCard getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(StudentCard studentCard) {
        this.studentCard = studentCard;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", studentCard=" + studentCard +
                ", courseList=" + courseList +
                '}';
    }
}
