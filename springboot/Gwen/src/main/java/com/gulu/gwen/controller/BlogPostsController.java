package com.gulu.gwen.controller;

import com.gulu.gwen.entity.BlogPosts;
import com.gulu.gwen.service.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
public class BlogPostsController {
    @Autowired
    private BlogPostsService blogPostsService;

    @GetMapping("/test")
    public List<BlogPosts> test() {
        return blogPostsService.getAll();
    }
    @GetMapping("/Id")
    public BlogPosts getById() {
        int id = 1;
        return blogPostsService.getById(id);
    }
}
