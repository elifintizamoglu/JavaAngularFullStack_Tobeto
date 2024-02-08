package org.example.homeworks.hw2.bank_implementation;

abstract class BaseCreditManager implements ICreditManager{

    // ortak metot olmadığı için içini doldurmadım, sadece imzasını yazdım
    @Override
    public abstract void calculate();

    // ortak metot olduğu için içini doldurdum
    @Override
    public void save() {
        System.out.println("Kaydedildi.");
    }
}
