package com.neusoft.ssm.section3.XMLInjection;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<String> list;

    /**
     * 使用构造注入
     * 提供带所有参数的构造方法
     *
     * @param userName
     * @param password
     * @param list
     */
    public User(String userName, String password, List<String> list) {
        super();
        this.userName = userName;
        this.password = password;
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }

    /**
     * 使用Setter方法注入
     * 提供默认空参构造方法
     * 为所有属性提供Setter()方法
     */
    public User() {
        super();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
