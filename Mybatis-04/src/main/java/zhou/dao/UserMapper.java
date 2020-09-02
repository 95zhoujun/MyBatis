package zhou.dao;

import zhou.pojo.User;

import java.util.List;
import java.util.Map;

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

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);
    //分页
    List<User> getUserRowBouds(Map<String,Integer> map);
}
