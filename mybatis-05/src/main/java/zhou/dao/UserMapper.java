package zhou.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zhou.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @auther zj
 * @create 2020-08-01 18:55
 */

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();

    //方法存在多个参数
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);



}
