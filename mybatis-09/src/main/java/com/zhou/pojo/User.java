package com.zhou.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther zj
 * @create 2020-09-02 9:14
 */
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
