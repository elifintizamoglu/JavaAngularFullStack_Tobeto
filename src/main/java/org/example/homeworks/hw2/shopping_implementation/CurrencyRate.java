package org.example.homeworks.hw2.shopping_implementation;

public class CurrencyRate {
    private double price;
    private int currency;

    public CurrencyRate() {
    }

    public CurrencyRate(double price, int currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }
}
