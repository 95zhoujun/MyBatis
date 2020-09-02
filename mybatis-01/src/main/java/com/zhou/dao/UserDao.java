package com.zhou.dao;

import com.zhou.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @auther zj
 * @create 2020-08-01 18:55
 */

public interface UserDao {
    List<User> getUserLike(String name);

    List<User> getUserList();

    User getUserById(int id);

    User getUserById2(Map<String,Object> map);

    int addUser2(Map<String,Object> map);

    int addUser(User user);

    int updateUser(User user);

    int deletUserById(int id);
}
