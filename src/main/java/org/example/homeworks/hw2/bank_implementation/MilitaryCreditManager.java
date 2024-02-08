package org.example.homeworks.hw2.bank_implementation;

// bu class bu interface'in operasyonlarını doldurmak zorundadır
public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı.");
    }
}
