package org.example.homeworks.hw3.oopWithNLayeredApp.dataAccess;

import org.example.homeworks.hw3.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product) {
        // sadece veri tabanına erişim kodları buraya yazılır -> SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
