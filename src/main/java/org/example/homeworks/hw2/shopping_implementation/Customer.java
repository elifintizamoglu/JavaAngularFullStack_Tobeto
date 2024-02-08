package org.example.homeworks.hw2.shopping_implementation;

public class Customer implements IEntity{

    private int id;
    private String name;
    private boolean isStudent;
    private boolean isOfficer;

    public Customer() {
    }

    public Customer(int id, String name, boolean isStudent, boolean isOfficer) {
        this.id = id;
        this.name = name;
        this.isStudent = isStudent;
        this.isOfficer = isOfficer;
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

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public boolean isOfficer() {
        return isOfficer;
    }

    public void setOfficer(boolean officer) {
        isOfficer = officer;
    }
}
