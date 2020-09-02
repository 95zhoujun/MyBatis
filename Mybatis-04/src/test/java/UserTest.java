import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import zhou.dao.UserMapper;
import zhou.pojo.User;
import zhou.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther zj
 * @create 2020-08-01 19:04
 */

public class UserTest {
    static Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void test(){
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("endIndex",3);
        List<User> users = (List<User>) mapper.getUserByLimit(map);
        for(User user :users){
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void getUserByRowBouds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1,2);

        //通过Java代码层面实现分页
         List<User> userList = sqlSession.selectList("zhou.dao.UserMapper.getUserRowBouds",null,rowBounds);

         for(User user : userList ){
             System.out.println(user);
         }

         sqlSession.close();
    }

}
