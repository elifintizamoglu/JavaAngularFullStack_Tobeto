package org.example.homeworks.hw2.bank_implementation;

public class CarCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Araba kredisi verildi.");
    }
}
