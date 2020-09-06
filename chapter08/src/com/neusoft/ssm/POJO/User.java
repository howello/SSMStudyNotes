package com.neusoft.ssm.POJO;

public class User {
    private int id;
    private String username;
    private String password;
    private Integer jf;
    private String job;
    private String phone;

    public User() {
    }

    public User(String username, String password, String job, String phone) {
        this.username = username;
        this.password = password;
        this.job = job;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getJf() {
        return jf;
    }

    public void setJf(Integer jf) {
        this.jf = jf;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jf=" + jf +
                ", job='" + job + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
