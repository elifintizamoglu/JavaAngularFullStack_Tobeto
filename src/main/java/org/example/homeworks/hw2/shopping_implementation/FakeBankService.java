package org.example.homeworks.hw2.shopping_implementation;

public class FakeBankService implements IBankService{
    @Override
    public double convertRate(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 5.30;
    }
}
