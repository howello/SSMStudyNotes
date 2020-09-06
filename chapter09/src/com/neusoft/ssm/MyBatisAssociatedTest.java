package com.neusoft.ssm;

import com.neusoft.ssm.POJO.Banji;
import com.neusoft.ssm.POJO.Course;
import com.neusoft.ssm.POJO.Student;
import com.neusoft.ssm.Utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class MyBatisAssociatedTest {
    /**
     * 嵌套查询
     */
    @Test
    public void findStudentByIdTest() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            Student student = sqlSession.selectOne("com.neusoft.ssm.mapper.StudentMapper.findStudentById", 1);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findBanjiTest() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            Banji banji = sqlSession.selectOne("com.neusoft.ssm.mapper.BanjiMapper.findBanjiWithStudent", 2);
            System.out.println(banji);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findCourseByIdTest() {
        try (SqlSession sqlSession = MyBatisUtil.getInstance()) {
            Course course = sqlSession.selectOne("com.neusoft.ssm.mapper.CourseMapper.findCourseWithStudent", 1);
            System.out.println(course);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
