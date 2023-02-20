package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // Girilen bir cumledeki ilk kelimeyi yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("cumle giriniz = ");
        String ilkKelime = oku.next();

        System.out.println("ilkKelime = " + ilkKelime);

        // 2. Yol
        Scanner okuStr = new Scanner(System.in);

        System.out.print("cumle tekrar giriniz = ");
        String cumle = okuStr.nextLine();

        int boslukIndex = cumle.indexOf(" ");
        String IlkKelime = cumle.substring(0, boslukIndex);
        System.out.println("IlkKelime = " + IlkKelime);
    }
}
