package org.example.homeworks.hw1;

import java.util.Scanner;

public class StudentNotes {
    public static void main(String[] args) {
        // 7- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,
        // 1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını
        // hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)

        Scanner input = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = input.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("----- " + i + ". Öğrenci -----");

            System.out.print("Adı: ");
            String ad = input.next();

            System.out.print("Soyadı: ");
            String soyad = input.next();

            double toplamNot=0;
            for(int j = 1; j<=3; j++){
                System.out.print(j + ". Sınav Notu: ");
                double sinavNotu = input.nextDouble();
                toplamNot += sinavNotu;
            }
            double notOrtalamasi = (toplamNot) / 3;
            System.out.println("Öğrenci Adı Soyadı: " + ad + " " + soyad);
            System.out.println("Not Ortalaması: " + notOrtalamasi);
        }
        input.close();
    }
}
