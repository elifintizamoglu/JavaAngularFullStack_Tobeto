package org.example.homeworks.hw2.bank_implementation;

public class CustomerManager {

    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        //parametre ile gelen customer'a class boyunca ulaşabilmek için eşitleriz
        this.iCreditManager = creditManager;
        // interfaceler referans tiptir, interfacei implemente edenlerin referansını tutabilir
    }

    public void save() {
        System.out.println("Müşteri kaydedildi.");
    }

    public void delete() {
        System.out.println("Müşteri silindi. ");
    }

    public void giveCredit(){
        iCreditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}
