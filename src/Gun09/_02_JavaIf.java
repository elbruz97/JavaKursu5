package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin negatif mi pozitif mi oludunu, 0 ise 0 yazdirinz.

        Scanner oku = new Scanner(System.in);

        System.out.print("sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.println("sayi pozitif");
        }

        if (sayi < 0)  // tek komut varsa paranteze gerek yok
            System.out.println("sayi negatif");


        if (sayi == 0)
            System.out.println("sayi 0");

    }
}
