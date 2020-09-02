package com.zhou.dao;

import com.zhou.pojo.Student;

import java.util.List;

/**
 * @auther zj
 * @create 2020-09-01 16:51
 */

public interface StudentMapper {

    //查询所有的学生信息,以及对应的老师的信息!
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
