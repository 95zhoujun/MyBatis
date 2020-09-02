package com.zhou.pojo;

import lombok.Data;

/**
 * @auther zj
 * @create 2020-09-01 16:49
 */

@Data
public class Student {
    private int id;
    private String name;

    //学生需要关联一个老师!
    private Teacher teacher;
}
