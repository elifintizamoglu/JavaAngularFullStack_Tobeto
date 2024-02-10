package org.example.homeworks.hw3.oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı: " + data);
    }
}
