package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ucretleri:
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl
        // kullanicidan kac saat kaldigini alarak ucreti yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Kac saat park ettiginizi giriniz = ");
        int saat = oku.nextInt();

        if (saat <= 3)
            System.out.println("Ucret = 10 tl");
        else if (saat <= 5)
            System.out.println("Ucret = 15 tl");
        else
            System.out.println("Ucret = 20 tl");
    }
}
