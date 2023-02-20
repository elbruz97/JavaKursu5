package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayinin pozitif, negatif, veya sifir oldugunu yaziniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 0)
            System.out.println("Pozitif");
        else if (sayi < 0)
            System.out.println("Negatif");
        else
            System.out.println("Sifir");

    }
}
