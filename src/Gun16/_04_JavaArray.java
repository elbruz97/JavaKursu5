package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 7 sayiyi aldiktan sonra kac tanesinin ortalamadan buyuk ve tek sayi oldugunu bulunuz.

        Scanner oku = new Scanner(System.in);

        int[] sayilar = new int[7];
        int toplam = 0;
        int ortalamadanBuyuk = 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Sayi giriniz = ");
            sayilar[i] = oku.nextInt();
            toplam += sayilar[i];
        }

        int ortalama = toplam / sayilar.length;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > ortalama && sayilar[i] % 2 != 0)
            ortalamadanBuyuk++;
        }

        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamadan buyuk ve tek sayi sayisi = " + ortalamadanBuyuk);
    }
}
