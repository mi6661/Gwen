package com.gulu.gwen;

import com.gulu.gwen.entity.BlogPosts;
import com.gulu.gwen.repository.BlogPostsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GwenApplicationTests {

    @Autowired
    BlogPostsRepository blogPostsRepository;
    @Test
    void contextLoads() {
    }
    @Test
    void testBaseQuery(){
        List<BlogPosts> all = blogPostsRepository.findAll();
        for (BlogPosts blogPosts : all) {
            System.out.println(blogPosts);
        }
    }
}
