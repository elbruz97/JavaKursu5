package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayinin birler basamaginin degerini yazi ile yaziniz.

        // 234  -> birler basamagi = 4
        // 234 % 10  -> 4

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        int sayi1 = oku.nextInt();

        int binlerBas = (sayi1 / 1000) % 10;
        int yuzlerBas = (sayi1 / 100) % 10;
        int onlarBas = (sayi1 / 10) % 10;
        int birlerBas = sayi1 % 10;

        switch (birlerBas) {
            case 0: System.out.println("sifir"); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("alti"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
        }
    }
}
