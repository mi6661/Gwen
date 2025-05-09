package com.gulu.gwen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gulu.gwen.entity.BlogPosts;
import com.gulu.gwen.repository.BlogPostsRepository;
import com.gulu.gwen.service.BlogPostsService;

@Service
public class BlogPostsServiceImpl implements BlogPostsService{
    @Autowired
    private BlogPostsRepository blogPostsRepository;
    @Override
    public List<BlogPosts> getAll() {
        return blogPostsRepository.findAll();
    }

    @Override
    public BlogPosts getById(int id) {
        return blogPostsRepository.getBlogPostsById(id);
    }

}