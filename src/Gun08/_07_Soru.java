package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Girilen 2 sayi birbirine esit mi yazdiriniz.

        Scanner okuInt = new Scanner(System.in);

        System.out.print("Birinci sayi = ");
        int say1 = okuInt.nextInt();

        System.out.print("Ikinci sayi = ");
        int say2 = okuInt.nextInt();

        System.out.println("Esit mi? " + (say1 == say2));

        // 2.Yontem
        boolean esitMi = (say1 == say2);
        System.out.println("esitMi = " + esitMi);
    }
}
