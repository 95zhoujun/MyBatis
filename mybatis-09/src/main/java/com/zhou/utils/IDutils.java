package com.zhou.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @auther zj
 * @create 2020-09-01 20:52
 */

@SuppressWarnings("all") //印制警告
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }
}
