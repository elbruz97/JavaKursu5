package Odevler;

import java.util.Scanner;

public class _02_Kasim11 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        // Soru 1
        System.out.print("Isminizi giriniz = ");
        String isim = oku.nextLine();
        System.out.println("isim = " + isim);

        // Soru 2
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();
        System.out.println("sayi = " + sayi);

        // Soru 3
        System.out.print("Meyve giriniz = ");
        String meyve = oku.nextLine();
        System.out.println("meyve = " + meyve);

        // Soru 4
        System.out.print("Kapi sayinizi giriniz = ");
        int kapi = oku.nextInt();
        System.out.println("Kapi sayisi = " + kapi);

        // Soru 5
        System.out.print("10 sene once yasadiginiz sehri giriniz = ");
        String sehir = oku.nextLine();
        System.out.println("sehir = " + sehir);

        // Soru 6
        System.out.print("Dogum gununuzu giriniz = ");
        String dogumGunu = oku.nextLine();
        System.out.println("Dogum gununuz = " + dogumGunu);

        // Soru 7
        System.out.print("Bir Banka Hesabiniz Var mi? ");
        boolean cevap = oku.nextBoolean();
        System.out.println("cevap = " + cevap);

        // Soru 8
        System.out.print("Kg cinsinden agirlik giriniz = ");
        byte kilo = oku.nextByte();
        System.out.println("agirlik = " + kilo);

        // Soru 9
        System.out.print("Boyunuzu float cinsinden giriniz = ");
        float boy = oku.nextFloat();
        System.out.println("boy = " + boy);
    }
}
