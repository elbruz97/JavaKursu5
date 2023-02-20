package Odevler.Aralik11_2DArrays_ArrayList;

public class Soru2 {
    public static void main(String[] args) {
        // 2.Soru:
        // 2D array'de olan elemanları toplayınız.

        int[][] sayilar2 = {{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam = 0;

        for (int i = 0; i < sayilar2.length; i++) {

            for (int j = 0; j < sayilar2[i].length; j++) {
                System.out.print(sayilar2[i][j] + "\t");
            }

            System.out.println();
        }

        for (int i = 0; i < sayilar2.length; i++) {

            for (int j = 0; j < sayilar2[i].length; j++) {
                toplam += sayilar2[i][j];
            }
        }

        System.out.println("toplam = " + toplam);
    }
}
