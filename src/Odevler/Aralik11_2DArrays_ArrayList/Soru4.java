package Odevler.Aralik11_2DArrays_ArrayList;

import java.util.ArrayList;

public class Soru4 {
    public static void main(String[] args) {
        // Soru 4
        // Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.

        int[][] sayilar = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ArrayList<Integer> sayilarList = new ArrayList<>();

        for (int i = 0; i <sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sayilarList.add(sayilar[i][j]);
            }
        }

        System.out.println("sayilarList = " + sayilarList);

    }
}
