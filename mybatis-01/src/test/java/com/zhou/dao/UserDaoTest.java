package com.zhou.dao;

import com.zhou.pojo.User;
import com.zhou.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther zj
 * @create 2020-08-01 19:04
 */

public class UserDaoTest {

    @Test
    public void test(){
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();

    }

    @Test
    public void testGetUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("userId",1);
        User user = userDao.getUserById2(map);
        System.out.println(user);
        sqlSession.close();

    }

    //增删改需要提交事物
    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User(4, "李倩","123456");
        int testUser = userDao.addUser(user);
        System.out.println(testUser);
        if(testUser>0){
            System.out.println("插入成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testAddUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userId",5);
        map.put("userName","明天");
        map.put("password","12349090");

        int testUser = userDao.addUser2(map);
        System.out.println(testUser);
        if(testUser>0){
            System.out.println("插入成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result = userDao.updateUser(new User(2,"小明","000000"));
        if(result>0){
            System.out.println("更新数据成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result = userDao.deletUserById(2);
        if(result>0){
            System.out.println("删除数据成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserLike("张");
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

}
