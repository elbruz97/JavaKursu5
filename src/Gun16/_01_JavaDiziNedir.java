package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        // bana bir tane tanimlamada BIRDEN FAZLA deger tutabilen bir degiskene ihtiyacim var;
        // COZUM:

        int[] notlar = new int[50]; // 50 tane int saklayabilen notlar serisi

        notlar[0] = 75;
        notlar[1] = 88;
        //...
        //...
        notlar[49] = 95;
        // notlar[50] = 56; challanger patlar

        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length); // 50 toplam eleman sayisini verir


        //dizi nasil okutulur?
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu giriniz = ");
            notlar[i] = oku.nextInt();
        }

        for (int i = 0; i < notlar.length; i++) {
            System.out.println(notlar[i]);
        }

    }
}
