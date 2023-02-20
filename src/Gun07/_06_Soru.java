package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadin, adini ve soyadini ayirip, ayri ayri yazdiriniz.

        Scanner okuStr = new Scanner(System.in);

        System.out.print("Ad Soyad = ");
        String adSoyad = okuStr.nextLine();

        int bosluk = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, bosluk);
        String soyad = adSoyad.substring(bosluk + 1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

    }
}
