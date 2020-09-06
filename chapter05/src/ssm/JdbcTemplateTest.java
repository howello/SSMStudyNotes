package ssm;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import ssm.Bean.User;
import ssm.Dao.UserDao;

import java.util.List;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        String sql = "create table user(id int primary key auto_increment,username varchar(40),password varchar(40))";
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        jdbcTemplate.execute(sql);
    }

    @Test
    public void addUserTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = new User();
        user.setUsername("jiangzhengq");
        user.setPassword("123");
        int ret = userDao.addUser(user);
        if (ret > 0) {
            System.out.println("成功插入");
        } else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void updateUserTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("456");
        int ret = userDao.updateUser(user);
        if (ret > 0) {
            System.out.println("成功插入");
        } else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void deleteUserTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        int ret = userDao.deleteUser(1);

        if (ret > 0) {
            System.out.println("成功插入");
        } else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void getUserByIdTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = userDao.getUserById(2);
        System.out.println(user);
    }

    @Test
    public void getAllUserTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        List<User> list = userDao.getAllUser();

        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void xmlTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        userDao.transJF(3, 2, 300);
        System.out.println("蒋政权牛逼");
    }

    @Test
    public void annotationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        userDao.transJF(3, 2, 300);
        System.out.println("蒋政权牛逼");
    }
}
