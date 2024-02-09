package org.example.homeworks.hw2.shopping_implementation;


// Merkez bankası kodu - değiştiremem
public class CentralBankService{
    public double convertCurrency(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 5.30;
    }
}
