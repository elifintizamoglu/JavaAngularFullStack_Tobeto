package org.example.homeworks.hw1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // 1- Switch case ile müşteriden alınan sipariş numarasına göre hangi ürünün
        // sipariş edildiğini belirleyen algoritma yazınız.Input için Scanner kullanınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Sipariş vermek istediğiniz meyvenin numarasını giriniz: \n" +
                "1- Elma\n" +
                "2- Armut\n" +
                "3- Erik\n" +
                "4- Çilek\n" +
                "Numaranız: ");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Elma sipariş verdiniz.");
                break;
            case 2:
                System.out.println("Armut sipariş verdiniz.");
                break;
            case 3:
                System.out.println("Erik sipariş verdiniz.");
                break;
            case 4:
                System.out.println("Çilek sipariş verdiniz.");
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");
        }
        input.close();
    }
}
