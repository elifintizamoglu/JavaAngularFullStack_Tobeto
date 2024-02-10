package org.example.homeworks.hw3.oopWithNLayeredApp.business;

import org.example.homeworks.hw3.oopWithNLayeredApp.core.logging.Logger;
import org.example.homeworks.hw3.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import org.example.homeworks.hw3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import org.example.homeworks.hw3.oopWithNLayeredApp.dataAccess.ProductDao;
import org.example.homeworks.hw3.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    // dependency injection
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }

        productDao.add(product);
        for (Logger logger : loggers){
            logger.log(product.getName());
        }
    }
}
