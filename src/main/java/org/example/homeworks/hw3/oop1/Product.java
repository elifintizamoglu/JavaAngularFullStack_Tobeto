package org.example.homeworks.hw3.oop1;

public class Product {
    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitsInStock;

    public Product() {
    }

    public Product(String name,
                   double unitPrice,
                   double discount,
                   String imageUrls,
                   int unitsInStock) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.imageUrl = imageUrl;
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrls() {
        return imageUrl;
    }

    public void setImageUrls(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
