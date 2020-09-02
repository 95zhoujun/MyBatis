package com.zhou.dao;

import com.zhou.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @auther zj
 * @create 2020-09-01 20:47
 */

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    //查询博客
    List<Blog> queryBlogChoose(Map map);

}
