package Odevler.Aralik18_SETS_2D_ArrayList;

import java.util.Collections;
import java.util.HashSet;

public class Soru2 {
    public static void main(String[] args) {
        // 2.Soru:
        // changeSet() isminde bir method oluşturun.
        // Parametre olarak bir String HashSet ve iki String alsin
        // return hashset olmalı
        //
        // Eğer HashSet, String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //
        // ÖRNEK:
        // hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //
        // String 1 = banana
        // String 2 = peach
        //
        // CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> meyveler = new HashSet<>();
        Collections.addAll(meyveler,"banana","strawberry","kiwi","pineapple");

        System.out.println("meyveler          = " + meyveler);
        changeSet(meyveler, "banana", "peach");
        System.out.println("meyveler degismis = " + meyveler);
    }

    public static HashSet<String> changeSet(HashSet<String> hsIn, String ilk, String iki){


            if (hsIn.contains(ilk)){
                hsIn.remove(ilk);
                hsIn.add(iki);
            }


        return hsIn;
    }
}
