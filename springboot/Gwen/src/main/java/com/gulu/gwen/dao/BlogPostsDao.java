package com.gulu.gwen.dao;


import com.gulu.gwen.entity.BlogPosts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogPostsDao {
    List<BlogPosts> getAll();

    BlogPosts getById(int id);
}
