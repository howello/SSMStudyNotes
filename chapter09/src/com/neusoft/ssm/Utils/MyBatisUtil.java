package com.neusoft.ssm.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory INSTANCE = null;

    public static SqlSession getInstance() throws IOException {
        if (INSTANCE == null) {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            INSTANCE = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return INSTANCE.openSession();
    }
}
