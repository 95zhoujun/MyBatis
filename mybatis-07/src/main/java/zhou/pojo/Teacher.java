package zhou.pojo;

import lombok.Data;

import java.util.List;

/**
 * @auther zj
 * @create 2020-09-01 16:49
 */

@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
