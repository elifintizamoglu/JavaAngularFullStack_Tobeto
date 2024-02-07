package org.example.kodlamaio;

import java.util.List;

public class Instructor {
    private int instructorId;
    private String name;
    private List<Course> courses;

    public Instructor() {
    }

    public Instructor(int instructorId, String name) {
        this.instructorId = instructorId;
        this.name = name;
    }

    public Instructor(int instructorId, String name, List<Course> courses) {
        this.instructorId = instructorId;
        this.name = name;
        this.courses = courses;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
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

