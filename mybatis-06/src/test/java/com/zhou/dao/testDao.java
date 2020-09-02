package com.zhou.dao;

import com.zhou.pojo.Student;
import com.zhou.pojo.Teacher;
import com.zhou.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @auther zj
 * @create 2020-09-01 16:58
 */

public class testDao {
    @Test
    public void testAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testGetStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper StudentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = StudentMapper.getStudent();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testGetStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper StudentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = StudentMapper.getStudent2();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
