package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        int kalan = sayi % 2; // 0, 1, veya -1
        System.out.println("kalan = " + kalan);

        if (kalan == 0)
            System.out.println("Cift sayi");
        else
            System.out.println("Tek sayi");
    }
}
