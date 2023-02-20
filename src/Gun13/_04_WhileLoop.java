package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayidan sadece pozitif olanlarinin toplamini bulunuz.

        Scanner oku = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        while (sayac < 3) {
            System.out.print((sayac + 1) + ".Sayiyi giriniz = ");
            int sayi = oku.nextInt();

            if (sayi > 0) {
                toplam = toplam + sayi;
            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
