package com.gulu.gwen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
public class BlogPosts {
    @Id
    private int id;
    private String title;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    public BlogPosts(int id, String title, String content, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BlogPosts() {

    }

    @Override
    public String toString() {
        return "BlogPosts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
