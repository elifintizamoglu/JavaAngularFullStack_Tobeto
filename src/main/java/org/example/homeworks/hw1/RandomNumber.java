package org.example.homeworks.hw1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        //4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve
        //doğru tahmin edene kadar devam eden bir program yazınız.
        //(While döngüsü ile yapınız ve rastgele sayı üretmek için Random sınıfını kullanınız)

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int rastgeleSayi = random.nextInt(10)+1;
        int tahmin;

        System.out.println("-----Sayı Tahmin Etme-----");
        while (true) {
            System.out.print("1 ile 10 arasında bir sayı tahmin edin: ");
            tahmin = input.nextInt();

            if (tahmin == rastgeleSayi) {
                System.out.println("Doğru tahmin! Sayı: " + rastgeleSayi);
                break;
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı giriniz.");
            } else {
                System.out.println("Daha büyük bir sayı giriniz.");
            }
        }
        input.close();
    }
}
