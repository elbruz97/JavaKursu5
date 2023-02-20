package Odevler.Aralik11_2DArrays_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Soru6 {
    public static void main(String[] args) {
        // Soru 6
        // getSum() isminde bir method oluşturun. Parametresi ArrayList olmalı. Return tipi int olmalı.
        //
        //ArrayList teki tüm sayıları birbiri ile toplayın. return olarak toplam sonucu döndürün.
        //
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı

        ArrayList<Integer> list=new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5);

        System.out.println(getSum(list));

    }

    public static int getSum(ArrayList<Integer> sayilarListe){
        int toplam = 0;

        for (int i = 0; i < sayilarListe.size(); i++) {
            toplam += sayilarListe.get(i);
        }

        return toplam;
    }
}
