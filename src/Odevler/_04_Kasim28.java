package Odevler;

import java.util.Scanner;

public class _04_Kasim28 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        // 1.Soru

        int sayac1 = 0;
        int toplam1 = 0;

        while (sayac1 < 5) {
            System.out.print((sayac1 + 1) + ".Sayiyi giriniz = ");
            int sayi1 = oku.nextInt();

            if (sayi1 % 2 != 0)
                toplam1 = toplam1 + sayi1;

            sayac1++;
        }
        System.out.println("toplam = " + toplam1);


        // 2.Soru

        int sayac2 = 0;
        int toplam2 = 0;

        while (sayac2 < 5) {
            System.out.print((sayac2 + 1) + ".Sayiyi giriniz = ");
            int sayi2 = oku.nextInt();

            if (sayi2 % 2 != 0)
                toplam2++;

            sayac2++;
        }
        System.out.println(toplam2 + " sayi tek");


        // 3.Soru

        int sayac3 = 1;
        int toplam3 = 0;

        System.out.print("Bir sayi giriniz = ");
        int sayi3 = oku.nextInt();

        while (sayac3 < sayi3) {

            toplam3 = toplam3 + sayac3;
            sayac3++;
        }
        System.out.println("toplam = " + toplam3);


        // 4. Soru

        int sayac4 = 0;
        int toplam4 = 0;

        while (sayac4 < 5) {
            System.out.print((sayac4 + 1) + ".Sayiyi giriniz = ");
            int sayi4 = oku.nextInt();

            if (sayi4 < 30 && sayi4 > 10)
                toplam4 = toplam4 + sayi4;

            sayac4++;
        }
        System.out.println("toplam = " + toplam4);


        // 5. Soru

        int sayac5 = 1;
        int toplam5 = 0;

        while (sayac5 < 100) {

            if (sayac5 % 10 == 5)
                toplam5++;

            sayac5++;
        }
        System.out.println(toplam5 + "sayinin birler basamagi 5");


        // 6. Soru

        int randomSayi = (int) (Math.random() * (20-10) + 10);
        int sayac6 = 1;
        int guess = 0;

        do {
            System.out.print(sayac6 + ".tahmini giriniz = ");
            guess = oku.nextInt();

            if (randomSayi == guess)
                System.out.println("Tebrikler bildiniz!");
            else
                System.out.println("Tekrar deneyiniz");

            sayac6++;

        } while (sayac6 < 4 && randomSayi != guess);

        if (randomSayi != guess)
            System.out.println("Bilemediniz. GAME OVER");
        System.out.println("randomSayi = " + randomSayi);

    }
}
