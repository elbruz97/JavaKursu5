package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir ogrencinin notuna gore 50 den buyuk veya esit ise gectiniz, kucuk ise kaldiniz yaziniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Ogrenci notu giriniz = ");
        int sayi = oku.nextInt();

        if (sayi >= 50) {
            System.out.println("Gectiniz");
        }

        if (sayi < 50) {
            System.out.println("Kaldiniz");
        }
    }
}
