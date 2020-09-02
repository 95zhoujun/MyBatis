package com.zhou.dao;
import com.zhou.pojo.User;

import java.util.List;

/**
 * @auther zj
 * @create 2020-08-01 18:55
 */

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deletUserById(int id);
}
