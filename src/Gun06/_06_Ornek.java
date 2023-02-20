package Gun06;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Girilen bir ad soyadi bas harflerini yazdirin.

        Scanner okuStr = new Scanner(System.in);

        System.out.print("Ad Soyad = ");
        String adSoyad = okuStr.nextLine();

        char ilkHarf = adSoyad.charAt(0);
        char soyadIlk = adSoyad.charAt(adSoyad.indexOf(" ") + 1);

        System.out.println("Initials = " + ilkHarf + "." + soyadIlk + ".");

    }
}
