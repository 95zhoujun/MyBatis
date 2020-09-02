import com.zhou.dao.UserMapper;
import com.zhou.pojo.User;
import com.zhou.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @auther zj
 * @create 2020-09-02 9:19
 */

public class MyTest {
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();

        System.out.println("==============================");
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = userMapper2.getUserById(1);
        System.out.println(user2);
        sqlSession.close();
    }
}
