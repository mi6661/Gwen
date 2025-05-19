package com.gulu.gwen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Categories {
    @Id
    private int id;
    private String name;

    public Categories(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Categories() {

    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
