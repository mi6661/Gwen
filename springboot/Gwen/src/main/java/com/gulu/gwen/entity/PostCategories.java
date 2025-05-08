package com.gulu.gwen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PostCategories {
    @Id
    private int post_id;
    private int category_id;
    public PostCategories() {}
    public PostCategories(int post_id, int category_id) {
        this.post_id = post_id;
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "PostCategories{" +
                "post_id=" + post_id +
                ", category_id=" + category_id +
                '}';
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
