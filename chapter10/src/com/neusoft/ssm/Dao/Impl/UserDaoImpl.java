package com.neusoft.ssm.Dao.Impl;

import com.neusoft.ssm.Dao.UserDao;
import com.neusoft.ssm.POJO.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserById(int id) {
        try {
            SqlSession sqlSession = this.getSqlSession();
            User user = sqlSession.selectOne("com.neusoft.ssm.Mapper.UserMapper.findUserById", id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
