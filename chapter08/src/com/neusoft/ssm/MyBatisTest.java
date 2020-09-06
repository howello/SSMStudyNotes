package com.neusoft.ssm;


import com.neusoft.ssm.POJO.User;
import com.neusoft.ssm.Utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisTest {
    @Test
    public void findUserByIdTest() throws IOException {
        //1. 读取配置文件
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);

        //2. 根据配置文件SqlSessionFactory实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        //3. 通过SqlSessionFactory 创建SqlSession实例
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4. SqlSession执行映射文件中定义的SQL，并返回映射结果
        User user = sqlSession.selectOne("com.neusoft.ssm.mapper.UserMapper.findUserById", 5);
        //5. 打印输出结果
        System.out.println(user);
        //6. 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void findUserByNameTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("com.neusoft.ssm.mapper.UserMapper.findUserByName", "df");
        for (User usr : users) {
            System.out.println(usr);
        }
        sqlSession.close();
    }

    @Test
    public void addUserTest() throws IOException {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            User user = new User("蒋政权", "ppssqq", "码农", "6666666");
            int rows = sqlSession.insert("com.neusoft.ssm.mapper.UserMapper.addUser", user);
            if (rows > 0) {
                System.out.println("插入成功！");
            } else {
                System.out.println("插入失败，可能太大");
            }
            sqlSession.commit();
        }
    }

    @Test
    public void updateUserTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User("蒋政权2", "1234567890", "摆地摊的", "09876543");
        user.setId(12);
        int rows = sqlSession.update("com.neusoft.ssm.mapper.UserMapper.updateUser", user);
        if (rows > 0) {
            System.out.println("更新成功，改变行数:" + rows);
        } else {
            System.out.println("更新失败");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int rows = sqlSession.delete("com.neusoft.ssm.mapper.UserMapper.deleteUser", "蒋政权");
        if (rows > 0) {
            System.out.println("删除成功，改变行数：" + rows);
        } else {
            System.out.println("删除失败！");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectUserByNameAndJobTest() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            User user = new User();
//            user.setUsername("d");
//            user.setJob("d");
            List<User> users = sqlSession.selectList("com.neusoft.ssm.mapper.UserMapper.findByJobAndName", user);
            for (User usr : users) {
                System.out.println(usr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserByNameOrJobTest() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            User user = new User();
//            user.setUsername("qwer");
//            user.setJob("d");
            List<User> users = sqlSession.selectList("com.neusoft.ssm.mapper.UserMapper.findByNameOrJob", user);
            for (User usr : users) {
                System.out.println(usr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateUserOneTest() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            User user = new User();
            user.setId(3);
            user.setUsername("蒋政权");
            user.setPassword("1237890");
            user.setJf(999);
            user.setJob("摆地摊的");
            user.setPhone("09876543");
            int rows = sqlSession.update("com.neusoft.ssm.mapper.UserMapper.updateUserOne", user);
            if (rows > 0) {
                System.out.println("更新成功，改变行数:" + rows);
            } else {
                System.out.println("更新失败");
            }
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectByIds() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < 5; i++) {
                list.add(i);
            }
            List<User> users = sqlSession.selectList("com.neusoft.ssm.mapper.UserMapper.findByIds", list);
            for (User usr : users) {
                System.out.println(usr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
