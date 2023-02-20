package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 4-9 arasi random sayi nasil uretirim?
        // Once aralik kadar sayi uret (9-4) yani 0-5 arasi, sonra min sayiyi ekle +4
        // (int)(Math.Random()*(max-min))+min

        // Girilen max ve min araliginda random sayi uret

        Scanner oku = new Scanner(System.in);

        System.out.print("min = ");
        int min = oku.nextInt();

        System.out.print("max = ");
        int max = oku.nextInt();

        int randomSayi = (int) (Math.random() * (max-min) + min);
        System.out.println("randomSayi = " + randomSayi);
    }
}
