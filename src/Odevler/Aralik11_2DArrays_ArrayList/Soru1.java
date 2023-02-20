package Odevler.Aralik11_2DArrays_ArrayList;

public class Soru1 {
    public static void main(String[] args) {
        // 1.Soru:
        // Bütün 2'leri 6'yla değiştirin

        int[][] sayilar1 = {{2,3,2} , {4,1,5} , {7,2,5}};

        for (int i = 0; i < sayilar1.length; i++) {  // satir sayisi

            // ilgili satirdaki oda sayisi
            for (int j = 0; j < sayilar1[i].length; j++) {
                System.out.print(sayilar1[i][j] + "\t");
            }

            System.out.println();
        }

        for (int i = 0; i < sayilar1.length; i++) {

            for (int j = 0; j < sayilar1[i].length; j++) {
                if (sayilar1[i][j] == 2)
                    sayilar1[i][j] = 6;
            }
        }

        System.out.println("-------------Yeni Hali----------------");

        for (int i = 0; i < sayilar1.length; i++) {  // satir sayisi

            // ilgili satirdaki oda sayisi
            for (int j = 0; j < sayilar1[i].length; j++) {
                System.out.print(sayilar1[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
