package org.example.homeworks.hw1;

public class StringMethods {
    public static void main(String[] args) {

        // 6- String metotlarını araştırınız. Her bir metot için örnek yapınız.

        String text = "Tobeto";
        System.out.println("Metin uzunluğu: " + text.length());
        System.out.println("4.indeksteki karakter: " + text.charAt(3));
        System.out.println("2.indeksten 4.indekse kadar alt dizi oluşturma: " + text.substring(2,4));
        System.out.println("Büyük harfe çevirme: " + text.toUpperCase());
        System.out.println("Küçük harfe çevirme: " + text.toLowerCase());
        System.out.println("A harfi ile başlayıp başlamadığının kontrolü: " + text.startsWith("A"));
        System.out.println("O harflerinin a harfine çevrilmesi: " + text.replace("o","a"));
        System.out.println("Metinde bulunan ilk 'o' harfinin indeksi: " + text.indexOf("o"));
        System.out.println("Metinde bulunan son 'o' harfinin indeksi: " + text.lastIndexOf("o"));
        System.out.println("Metin boş mu kontrolü: " + text.isEmpty());
        System.out.println("'İstanbul Kodluyor' metni ile karşılaştırılması: " + text.equals("İstanbul Kodluyor"));
    }
}
