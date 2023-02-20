package Odevler.Aralik11_2DArrays_ArrayList;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {
        // Soru 3
        // Bütün ohio'ları Florida'yla değiştiriniz.

        String[][] sehirler = {
                {"new jersey","atlanta","ohio"} ,

                {"Pittsburgh" ,"ohio","new york","ohio"} ,

                {"ohio","new york"}};

        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler[i].length; j++) {
                if (sehirler[i][j].equals("ohio"))
                    sehirler[i][j]="Florida";
            }
        }

        System.out.println(Arrays.deepToString(sehirler));
    }
}
