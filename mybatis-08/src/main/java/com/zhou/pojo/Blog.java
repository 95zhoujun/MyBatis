package com.zhou.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @auther zj
 * @create 2020-09-01 20:41
 */

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
