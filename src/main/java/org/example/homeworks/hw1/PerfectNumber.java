package org.example.homeworks.hw1;

public class PerfectNumber {
    public static void main(String[] args) {
        //5- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

        int number = 8;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if(sum == number){
            System.out.println("Sayı mükemmel bir sayıdır.");
        }else{
            System.out.println("Sayı mükemmel bir sayı değildir.");
        }
    }
}
