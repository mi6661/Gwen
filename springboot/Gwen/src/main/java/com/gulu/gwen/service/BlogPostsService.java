package com.gulu.gwen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gulu.gwen.entity.BlogPosts;


public interface BlogPostsService{

    List<BlogPosts> getAll();

    BlogPosts getById(int id);
}