package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulup ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Karenin kenarini giriniz = ");
        int kenar = oku.nextInt();

        int cevre = kenar * 4;
        int alan = kenar * kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
