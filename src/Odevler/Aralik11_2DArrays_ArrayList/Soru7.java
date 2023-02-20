package Odevler.Aralik11_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Soru7 {
    public static void main(String[] args) {
        // Soru 7
        // getLength() isminde bir method oluşturun. Parametre olarak String ArrayList. Return tipi Integer ArrayList
        //
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //
        //Örneğin;
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın;
        //cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "New Jersey", "New york", "Ohio", "Florida", "Boston");

        for (Integer i : getLength(list)) {
            System.out.print(i + " ");

        }
    }

    public static ArrayList<Integer> getLength(ArrayList<String> list) {

        ArrayList<Integer> listInt = new ArrayList<>();

        for (String s : list) {
            listInt.add(s.length());
        }

        return listInt;
    }
}
