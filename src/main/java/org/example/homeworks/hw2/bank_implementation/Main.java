package org.example.homeworks.hw2.bank_implementation;

public class Main {
    public static void main(String[] args) {

        // ----- Değer Tip -----

        /*int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);*/


        // ----- Referans Tip -----

        /*int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{10, 20, 30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]);*/


        // ----- Class / Constructor / Inheritance -----

        //bu kısım stackte tutulur    //newlediğim anda heap'te referans oluşur
        /*CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager1 = new CustomerManager(customer);
        customerManager1.save();
        customerManager1.delete();

        Company company = new Company();
        company.setTaxNumber("10000");
        company.setCompanyName("Arçelik");
        company.setId(100);
        System.out.println("a");
        // customer isteyen CustomerManager'a company verebilirim çünkü o da bir customer
        CustomerManager customerManager2 = new CustomerManager(new Person());

        // Eğer inheritance varsa bunlar referans tiptir.
        // Customer c2 kısmının yaptığı şey, Person'ın heapte oluşan referansını tutmaktır.
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();

        Person person = new Person();
        person.setNationalIdentity("123456789");*/

        // ----- Interface -----
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();
    }
}
