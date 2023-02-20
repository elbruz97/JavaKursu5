package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 sayiyi aldiktan sonra Toplama icin T, Cikartma icin C, Carrpma icin P, Bolme icin B
        // harflerini alarak istege gore islemi yapip sonucu yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("ilk sayi = ");
        int sayi1 = oku.nextInt();

        System.out.print("ikinci sayi = ");
        int sayi2 = oku.nextInt();

        Scanner okuStr = new Scanner(System.in);

        System.out.println("Toplama icin T giriniz");
        System.out.println("Cikartma icin C giriniz");
        System.out.println("Carpma icin P giriniz");
        System.out.println("Bolme icin B giriniz");

        String islem = okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("Toplam = " + (sayi1 + sayi2));
        else if (islem.equalsIgnoreCase("C"))
            System.out.println("Fark = " + (sayi1 - sayi2));
        else if (islem.equalsIgnoreCase("P"))
            System.out.println("Carpim = " + (sayi1 * sayi2));
        else if (islem.equalsIgnoreCase("B"))
            System.out.println("Bolum = " + (sayi1 / sayi2));
        else
            System.out.println("Yanlis secim");


    }
}
