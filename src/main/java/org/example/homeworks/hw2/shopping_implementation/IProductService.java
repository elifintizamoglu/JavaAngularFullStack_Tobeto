package org.example.homeworks.hw2.shopping_implementation;

public interface IProductService {

    // ne satacağım, kime satacağım belirtmek adına bu iki parametreyi alır
    void sell(Product product, Customer customer);
}
