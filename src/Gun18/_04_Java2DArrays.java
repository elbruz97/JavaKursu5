package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 luk tabloyu kullanicidan sayi alarak doldurunuz ve en buyuk sayiyi bulunuz.

        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[2][3];
        int enb = tablo[0][0];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(i + ".satir " + j + ".sutun" +"Rakam Giriniz = ");
                tablo[i][j] = oku.nextInt();

                if (tablo[i][j] > enb)
                    enb = tablo[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(tablo[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("enb = " + enb);
    }
}
