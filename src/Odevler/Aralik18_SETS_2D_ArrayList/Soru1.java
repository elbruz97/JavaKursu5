package Odevler.Aralik18_SETS_2D_ArrayList;

import java.util.HashSet;

public class Soru1 {
    public static void main(String[] args) {
        // 1.Soru:
        // totalCount() isminde bir method oluşturun
        // Parametresi: Integer Hashset olmalı
        //
        // HashSetteki eleman sayısını alın.
        // totalCount'u döndürün.
        //
        // Örnek:
        // hashset ; 4,2,3,1,7
        // CEVAP: 5

        HashSet<Integer> hs = new HashSet<>();
        hs.add(4);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(7);

        int sayisi = totalCount(hs);
        System.out.println("sayisi = " + sayisi);

    }

    public static int totalCount(HashSet<Integer> hsIn){
        int count = 0;

        for (Integer i : hsIn)
            count++;

        return count;
    }
}
