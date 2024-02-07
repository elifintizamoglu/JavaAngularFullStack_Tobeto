package org.example.homeworks.hw1;

public class While_DoWhile {
    public static void main(String[] args) {
        // 3- Do-While ve While döngüsü nedir?
        // Bununla ilgili örnek yapınız.

        int a = 0, b = 0;
        System.out.println("-----While Döngüsü-----");
        while (a > 0) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println();

        System.out.println("-----Do-While Döngüsü-----");
        do {
            System.out.print(b + " ");
            b--;
        } while (b > 0);

    }
}
