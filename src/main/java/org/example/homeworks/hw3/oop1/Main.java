package org.example.homeworks.hw3.oop1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setImageUrls("kahveMak.png");
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        product2.setName("Elektrikli Süpürge");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setImageUrls("supurge.png");
        product2.setUnitsInStock(2);

        Product product3 = new Product();
        product3.setName("Fön Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setImageUrls("kahveMak.png");
        product3.setUnitsInStock(4);

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("05222222222");
        individualCustomer.setFirstName("Elif");
        individualCustomer.setLastName("İntizamoğlu");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("987654");
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("11111111111");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}
