package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin tek mi cift mi oldugunu yazdirinz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0) {    // 0 gelirse
            System.out.println("sayi cift");
        }

        if (sayi % 2 != 0) {    // 1 veya -1 gelirse (eksi sayilari da kapsiyor)
            System.out.println("sayi tek");
        }
    }
}
