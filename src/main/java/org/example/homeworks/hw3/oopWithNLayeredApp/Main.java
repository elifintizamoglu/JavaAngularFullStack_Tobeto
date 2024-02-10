package org.example.homeworks.hw3.oopWithNLayeredApp;

import org.example.homeworks.hw3.oopWithNLayeredApp.business.ProductManager;
import org.example.homeworks.hw3.oopWithNLayeredApp.core.logging.DatabaseLogger;
import org.example.homeworks.hw3.oopWithNLayeredApp.core.logging.FileLogger;
import org.example.homeworks.hw3.oopWithNLayeredApp.core.logging.Logger;
import org.example.homeworks.hw3.oopWithNLayeredApp.core.logging.MailLogger;
import org.example.homeworks.hw3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import org.example.homeworks.hw3.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Iphone", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}
