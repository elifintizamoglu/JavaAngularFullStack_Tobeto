package org.example.homeworks.hw3.oopWithNLayeredApp.dataAccess;

import org.example.homeworks.hw3.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
