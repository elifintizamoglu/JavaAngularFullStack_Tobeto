package org.example.kodlamaio;

import java.util.List;

public class Category {
    private int categoryId;
    private String name;
    private List<Course> courses;

    public Category() {
    }

    public Category(int categoryId, String name, List<Course> courses) {
        this.categoryId = categoryId;
        this.name = name;
        this.courses = courses;
    }

    public Category(int categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

