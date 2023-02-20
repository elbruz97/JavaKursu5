package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Girilen sayi 50 den buyuk ise 1, degilse 0 yazdiriniz
        // Ternary operator ile

        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();

        String sonuc = (sayi > 50) ? "1" : "0";
        System.out.println("50 den buyuk mu? = " + sonuc);

        // 2. Yol
        System.out.println((sayi > 50) ? 1 : 0);
    }
}
