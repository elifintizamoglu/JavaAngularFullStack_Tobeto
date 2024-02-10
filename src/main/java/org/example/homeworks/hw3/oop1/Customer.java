package org.example.homeworks.hw3.oop1;

public class Customer {
    private int id;
    private String customerNumber;
    private String phone;

    public Customer() {
    }

    public Customer(int id, String customerNumber, String phone) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
