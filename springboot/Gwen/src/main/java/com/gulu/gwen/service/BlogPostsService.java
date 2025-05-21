package com.gulu.gwen.service;

import com.gulu.gwen.entity.BlogPosts;
import com.gulu.gwen.service.impl.BlogPostsServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogPostsService{
    BlogPosts save(BlogPosts post);
    List<BlogPosts> getAll();
    BlogPosts getById(Long id);
    void deleteById(Long id);
}
