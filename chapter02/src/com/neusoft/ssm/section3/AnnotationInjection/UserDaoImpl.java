package com.neusoft.ssm.section3.AnnotationInjection;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("已保存···");
    }
}
