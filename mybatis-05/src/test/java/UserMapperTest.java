import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zhou.dao.UserMapper;
import zhou.pojo.User;
import zhou.utils.MybatisUtils;

import java.util.List;

/**
 * @auther zj
 * @create 2020-09-01 12:06
 */

public class UserMapperTest {

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUserList();
        for(User user : users){
            System.out.println(user);
        }

    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.addUser(new User(6,"乐乐","1234455"));
        if(result>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }

        sqlSession.close();
    }
}
