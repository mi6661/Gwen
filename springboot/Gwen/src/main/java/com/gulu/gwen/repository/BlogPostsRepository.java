package com.gulu.gwen.repository;

import com.gulu.gwen.entity.BlogPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostsRepository extends JpaRepository<BlogPosts,Long> {

}
