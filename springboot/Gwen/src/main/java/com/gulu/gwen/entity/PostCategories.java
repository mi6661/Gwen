package com.gulu.gwen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
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
}
