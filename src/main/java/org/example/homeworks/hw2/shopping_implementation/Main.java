package org.example.homeworks.hw2.shopping_implementation;

public class Main {
    public static void main(String[] args) {
        IProductService productService = new ProductManager(new FakeBankService());
        productService.sell(new Product(1, "Laptop", 1000), new Customer(1, "Elif", true, false));
    }
}
