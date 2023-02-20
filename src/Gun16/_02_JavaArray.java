package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kisilik bir sinifin notlarini giriniz ve ortalamadan buyuk kac not oldugunu bulunuz.

        Scanner oku = new Scanner(System.in);

        int[] notlar = new int[5];
        int[] ortalamadanBuyukNotlar = new int[5];
        int toplam = 0;
        int ortalamadanBuyuk = 0;

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu giriniz = ");
            notlar[i] = oku.nextInt();
            toplam += notlar[i];
        }

        int ortalama = toplam / notlar.length;

        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] > ortalama)
                ortalamadanBuyukNotlar[i] = notlar[i];
                ortalamadanBuyuk++;
        }

        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamadan buyuk not sayisi = " + ortalamadanBuyuk);

    }
}
