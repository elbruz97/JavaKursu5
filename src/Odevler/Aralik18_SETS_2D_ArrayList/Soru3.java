package Odevler.Aralik18_SETS_2D_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Soru3 {
    public static void main(String[] args) {
        // 3.Soru:
        // commonValues() isminde bir method oluşturun ve parametresi 2 tane hashset olmalı
        // return tipi arraylist olmalı
        //
        // Ortak değerleri ArrayListe ekleyiniz, ArrayListi yazdırınız
        //
        // ÖRNEK:
        //
        // 1. Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
        // 2. Hashset : "Germany" , "China" , "Brazil" , "France" , "USA"
        //
        // çıktı:  "Germany" , "Brazil" ,"USA"

        HashSet<String> hs1 = new HashSet<>();
        Collections.addAll(hs1, "Germany", "England", "South Africa", "Brazil", "USA");

        HashSet<String> hs2 = new HashSet<>();
        Collections.addAll(hs2, "Germany", "China", "Brazil", "France", "USA");

        System.out.println(commonValues(hs1, hs2));
    }

    public static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {

        HashSet<String> common = new HashSet<>(hs1);
        common.retainAll(hs2);

        return new ArrayList<>(common);
    }
}
