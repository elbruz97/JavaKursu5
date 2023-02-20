package Odevler.Aralik18_SETS_2D_ArrayList;

import java.util.ArrayList;

public class Soru5 {
    public static void main(String[] args) {
        // 5.Soru:
        // Bir tane 2d array [][] oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //
        // Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //
        // Örnek:
        // Girdi: [
        //        [ 1, 2, 3 ],
        //        [ 4, 5, 6 ],
        //        [ 7, 8, 9 ]
        //        ]
        //
        // Çıktı: [1,2,3,4,5,6,7,8,9]

        int[][] dizi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int[] ints : dizi) {

            for (int j = 0; j < dizi.length; j++) {

                arrayList.add(ints[j]);
            }
        }

        System.out.println(arrayList);
    }
}
