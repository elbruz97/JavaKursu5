package Odevler.Aralik11_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Soru5 {
    public static void main(String[] args) {
        // Soru 5
        // ismi getCount() olan bir method oluşturun.
        //
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Orange");
        meyveler.add("Kiwi");
        meyveler.add("Peach");
        meyveler.add("Banana");
        meyveler.add("Orange");

        int tane = getCount(meyveler, "Kiwi");
        System.out.println("tane = " + tane);
    }

    public static int getCount(ArrayList<String>liste, String aranacakKelime){
        int count = 0;

        for (int i = 0; i < liste.size(); i++) {
            if (Objects.equals(liste.get(i), aranacakKelime))
                count++;
        }
        
        return count; 
    }
}
