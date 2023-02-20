package Odevler.Aralik11_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Soru8 {
    public static void main(String[] args) {
        // Soru 8
        // İsmi changelnArraylist() olan bir method oluşturun. Parametre olarak String ArrayList, String s1, String s2
        //
        // Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList
        //
        // Örneğin;
        // Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        // s1 = blue
        // s2 = yellow
        // Tüm blue'ları yellow'a dönüştürün.
        // cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "yellow", "red", "blue", "red", "blue");

        for (String s : changeArrayList(list)) {
            System.out.print(s + " ");
        }
    }

    public static ArrayList<String> changeArrayList(ArrayList<String> list) {

        ArrayList<String> changedList = new ArrayList<>();

        for (String s : list) {

            if (s.equals("blue"))
                s = "yellow";

            changedList.add(s);
        }

        return changedList;
    }
}
