package Odevler.Aralik18_SETS_2D_ArrayList;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Soru4 {
    public static void main(String[] args) {
        // 4.Soru:
        // removing() isminde bir method oluşturun.
        // Parametre olarak bir LinkedHashset ve iki String almali
        // Return tipi LinkedHashset
        //
        // Eğer Stringler, LinkedHashset'in içinde varsa, sil.
        //
        // Örnek:
        //
        // linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //
        // String 1= Germany
        // String 2 = USA
        //
        // Cikti: France , Canada , Mexico , Brazil

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        Collections.addAll(lhs, "Germany", "France", "USA", "Canada", "Mexico", "Brazil");

        String s1 = "Germany", s2 = "USA";

        System.out.println(removing(lhs, s1, s2));
    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String s1, String s2) {

        if (lhs.contains(s1))
            lhs.remove(s1);

        if (lhs.contains(s2))
            lhs.remove(s2);

        return lhs;
    }
}
