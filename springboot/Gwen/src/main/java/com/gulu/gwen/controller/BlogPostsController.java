package com.gulu.gwen.controller;

import com.gulu.gwen.service.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class BlogPostsController {
    @Autowired
    private BlogPostsService blogPostsService;

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
