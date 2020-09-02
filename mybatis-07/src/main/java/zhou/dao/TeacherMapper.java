package zhou.dao;

import org.apache.ibatis.annotations.Param;
import zhou.pojo.Teacher;

import java.util.List;

/**
 * @auther zj
 * @create 2020-09-01 16:52
 */

public interface TeacherMapper {
//    List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
