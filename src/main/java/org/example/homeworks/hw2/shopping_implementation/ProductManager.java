package org.example.homeworks.hw2.shopping_implementation;

public class ProductManager implements IProductService {

    private IBankService iBankService;

    public ProductManager(IBankService iBankService) {
        this.iBankService = iBankService;
    }

    @Override
    public void sell(Product product, Customer customer) {
        double price = product.getPrice();
        if (customer.isStudent()) {
            price = product.getPrice() * 0.90;
        }

        if (customer.isOfficer()) {
            price = product.getPrice() * 0.80;
        }
        price = iBankService.convertRate(new CurrencyRate(1,100));
        System.out.println(price);
    }
}
