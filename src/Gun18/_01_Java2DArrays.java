package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int[][] tumDersNotlari = new int[3][50]; // 3 tane ders 50 tane ogrenci, 150 tane not
                                                 // 3 rows, 50 columns
                                                 // Satir: 0, 1, 2    Sutun: 0, 1, 2, 3, .... 49

        tumDersNotlari[0][0] = 80;  // (0, 0) a 80 degeri atandi

        System.out.println("tumDersNotlari = " + tumDersNotlari[0][0]);

        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0] = oku.nextInt();

    }
}
