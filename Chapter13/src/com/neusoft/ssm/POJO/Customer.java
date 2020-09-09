package com.neusoft.ssm.POJO;

public class Customer {
    private Integer id;
    private String loginname;
    private String nickname;
    private String password;

    public Customer() {
    }

    public Customer(Integer id, String loginname, String nickname, String password) {
        this.id = id;
        this.loginname = loginname;
        this.nickname = nickname;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
