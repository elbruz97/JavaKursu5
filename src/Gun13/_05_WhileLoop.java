package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar olan sayilarin toplamini bulunuz.

        Scanner oku = new Scanner(System.in);

        int i = 1;
        int toplam = 0;

        while (i <= 100) {

            toplam = toplam + i;
            i++;
        }

        System.out.println("toplam = " + toplam);
    }
}
