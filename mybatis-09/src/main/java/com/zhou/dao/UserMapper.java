package com.zhou.dao;

import com.zhou.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zj
 * @create 2020-09-02 9:15
 */

public interface UserMapper {
    User getUserById(@Param("id") int id);
}
