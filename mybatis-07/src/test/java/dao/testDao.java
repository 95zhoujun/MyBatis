package dao;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zhou.dao.StudentMapper;
import zhou.dao.TeacherMapper;
import zhou.pojo.Teacher;
import zhou.utils.MybatisUtils;

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
        Teacher teacher = teacherMapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }


}
