package org.example.homeworks.hw1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // 2- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak
        // toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
        // (Input için Scanner ve döngü için for döngüsü kullanınız)

        int urunAdedi;
        double toplam = 0;
        double urununFiyati;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç ürün almak istediğinizi giriniz: ");
        urunAdedi = input.nextInt();


        for (int i = 1; i <= urunAdedi; i++) {
            System.out.print(i + ". ürünün fiyatını giriniz: ");
            urununFiyati = input.nextInt();
            toplam = toplam + urununFiyati;
        }
        System.out.println("Toplam tutar: " + toplam);
        input.close();
    }
}
