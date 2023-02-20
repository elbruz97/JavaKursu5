package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Girilen bir sayinin sifir mi, negatif mi, pozitif mi oldugunu
        // ternary operator ile yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();



        System.out.println(sayi == 0 ? "sifir" : (sayi > 0 ? "pozifit" : "negatif"));
    }
}
