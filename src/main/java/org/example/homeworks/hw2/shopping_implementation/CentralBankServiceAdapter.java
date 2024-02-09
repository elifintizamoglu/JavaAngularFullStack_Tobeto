package org.example.homeworks.hw2.shopping_implementation;

// Bankanın servisini kendi sistemime dahil etmeye çalışıyorum
public class CentralBankServiceAdapter implements IBankService{
    @Override
    public double convertRate(CurrencyRate currencyRate) {
        CentralBankService centralBankService = new CentralBankService();
        return centralBankService.convertCurrency(currencyRate);
    }
}
