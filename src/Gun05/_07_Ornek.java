package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Bir dikdortgenin kenarlarini kullanicidan isteyip cevresini ve alanini bulup ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Dikdortgenin kisa kenarini giriniz = ");
        int kisaKenar = oku.nextInt();

        System.out.print("Dikdortgenin uzun kenarini giriniz = ");
        int uzunKenar = oku.nextInt();

        int cevre = (kisaKenar + uzunKenar) * 2;
        int alan = kisaKenar * uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
