package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Gunun Sorusu: 3x2 lik bir diziyi kullanicidan sayi alarak doldurunuz.
        // Sonra sadece tek elemanlarini tek boyutlu bir diziye atayiniz.

        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];
        int tek = 0;

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Rakam Giriniz = ");
                tablo[i][j] = oku.nextInt();

                if (tablo[i][j] % 2 != 0)
                    tek++;
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.print(tablo[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("tek sayi sayisi = " + tek);

        int[] teklerDizisi = new int[tek];

        tek = 0;

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                if (tablo[i][j] % 2 != 0) {
                    teklerDizisi[tek] = tablo[i][j];
                    tek++;
                }
            }
        }

        System.out.println(Arrays.toString(teklerDizisi));
    }
}
