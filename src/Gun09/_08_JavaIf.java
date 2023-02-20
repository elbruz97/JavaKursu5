package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Kullanicidan 2 kez girecegi sifresinin ayni olup olmadigini yaziniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("sifreyi giriniz = ");
        String sifre1 = oku.nextLine();

        System.out.print("tekrar sifreyi giriniz = ");
        String sifre2 = oku.nextLine();

        if (sifre1.equals(sifre2)) {
            System.out.println("AYNI");
        }

        if (!sifre1.equals(sifre2)) {
            System.out.println("AYNI DEGIL");
        }
    }
}
