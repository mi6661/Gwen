package com.gulu.gwen.controller;

import com.gulu.gwen.entity.BlogPosts;
import com.gulu.gwen.service.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogPostsController {
    @Autowired
    private BlogPostsService blogPostsService;

    @GetMapping("/list")
    public List<BlogPosts> getAllBlogPosts() {
        return blogPostsService.getAll();
    }

    @GetMapping("/id")
    public BlogPosts getId(@RequestParam int id) {
        return blogPostsService.getById(id);
    }
}
