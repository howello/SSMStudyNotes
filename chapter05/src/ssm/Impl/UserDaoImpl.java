package ssm.Impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ssm.Bean.User;
import ssm.Dao.UserDao;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(username,password) value(?,?)";
        Object[] obj = new Object[]{
                user.getUsername(),
                user.getPassword()
        };
        return this.jdbcTemplate.update(sql, obj);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set username=?,password=?where id=?";
        Object[] obj = new Object[]{
                user.getUsername(),
                user.getPassword(),
                user.getId()
        };
        return this.jdbcTemplate.update(sql, obj);
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from user where id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    @Override
    public User getUserById(int id) {
        String sql = "select * from user where id=?";
        RowMapper<User> mapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTemplate.queryForObject(sql, mapper, id);
    }

    @Override
    public List<User> getAllUser() {
        String sql = "select * from user";
        RowMapper<User> mapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTemplate.query(sql, mapper);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void transJF(int outUserId, int inUserId, int jf) {
        String sql = "update user set jf=jf-? where id=?";
        this.jdbcTemplate.update(sql, jf, outUserId);
        
        //模拟系统运行时的突发性问题
        int i = 1 / 0;
        sql = "update user set jf=jf+? where id=?";
        this.jdbcTemplate.update(sql, jf, inUserId);
    }
}
