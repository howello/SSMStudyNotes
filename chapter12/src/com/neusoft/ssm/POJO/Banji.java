package com.neusoft.ssm.POJO;

import java.util.List;

public class Banji {
    private Integer banji_id;
    private String banji_name;
    private List<Student> studentList;

    public Banji() {
    }

    public Banji(Integer banji_id, String banji_name, List<Student> studentList) {
        this.banji_id = banji_id;
        this.banji_name = banji_name;
        this.studentList = studentList;
    }

    public Integer getBanji_id() {
        return banji_id;
    }

    public void setBanji_id(Integer banji_id) {
        this.banji_id = banji_id;
    }

    public String getBanji_name() {
        return banji_name;
    }

    public void setBanji_name(String banji_name) {
        this.banji_name = banji_name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Banji{" +
                "banji_id=" + banji_id +
                ", banji_name='" + banji_name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
