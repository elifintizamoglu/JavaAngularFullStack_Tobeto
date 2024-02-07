package org.example.kodlamaio;

public class Course {
    private int courseId;
    private String name;
    private int percent;
    private String description;
    private Instructor instructor;
    private Category category;

    public Course() {
    }

    public Course(int courseId, String name, int percent, String description, Instructor instructor, Category category) {
        this.courseId = courseId;
        this.name = name;
        this.percent = percent;
        this.description = description;
        this.instructor = instructor;
        this.category = category;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

