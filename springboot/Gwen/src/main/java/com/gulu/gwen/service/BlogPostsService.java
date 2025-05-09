package com.gulu.gwen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gulu.gwen.entity.BlogPosts;

@Service
public interface BlogPostsService{
    public List<BlogPosts> getAll();
    public BlogPosts getById(int id);
}