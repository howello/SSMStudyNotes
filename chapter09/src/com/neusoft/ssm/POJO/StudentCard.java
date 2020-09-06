package com.neusoft.ssm.POJO;

public class StudentCard {
    private Integer id;
    private String code;

    public StudentCard() {
    }

    public StudentCard(String code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "StudentCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
