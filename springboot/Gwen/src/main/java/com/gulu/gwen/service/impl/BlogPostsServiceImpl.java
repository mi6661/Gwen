package com.gulu.gwen.service.impl;


import com.gulu.gwen.entity.BlogPosts;
import com.gulu.gwen.repository.BlogPostsRepository;
import com.gulu.gwen.service.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostsServiceImpl implements BlogPostsService {

    @Autowired
    private BlogPostsRepository blogPostsRepository;

    @Override
    public BlogPosts save(BlogPosts post) {
        return blogPostsRepository.save(post);
    }

    @Override
    public List<BlogPosts> getAll() {
        return blogPostsRepository.findAll();
    }

    @Override
    public BlogPosts getById(Long id) {
        return blogPostsRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        blogPostsRepository.deleteById(id);
    }
}
