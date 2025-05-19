package com.gulu.gwen.service.impl;

import java.util.List;

import com.gulu.gwen.dao.BlogPostsDao;
import com.gulu.gwen.entity.BlogPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gulu.gwen.service.BlogPostsService;

@Service
public class BlogPostsServiceImpl implements BlogPostsService{

    @Autowired
    private BlogPostsDao blogPostsDao;

    @Override
    public List<BlogPosts> getAll() {
        return blogPostsDao.getAll();
    }

    @Override
    public BlogPosts getById(int id) {
        return blogPostsDao.getById(id);
    }
}