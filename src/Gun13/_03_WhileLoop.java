package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girlen 5 sayinin toplamini yazdiriniz.

        Scanner oku = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        while (sayac < 5) {
            System.out.print((sayac + 1) + ".Sayiyi giriniz = ");
            int sayi = oku.nextInt();

            toplam = toplam + sayi;
            sayac++;
        }

        System.out.println("toplam = " + toplam);
    }
}
