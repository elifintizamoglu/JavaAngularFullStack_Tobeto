package org.example.kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category(1, "Kodlamaya Giriş");

        Instructor instructor1 = new Instructor(1, "Ali Veli");
        Instructor instructor2 = new Instructor(2, "İrem Balcı");

        Course course1 = new Course(1,
                "Java 101",
                15,
                "abc",
                instructor1,
                category1);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        instructor1.setCourses(courses);

        Course course2 = new Course(2,
                "Yazılım Geliştirici Yetiştirme Kampı C#",
                25,
                "def",
                instructor2,
                category1);


        System.out.println(course1.getCategory().getName());
    }
}
