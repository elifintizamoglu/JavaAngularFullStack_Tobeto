package org.example.homeworks.hw2.bank_implementation;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }
}
