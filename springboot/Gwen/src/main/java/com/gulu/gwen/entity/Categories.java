package com.gulu.gwen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
