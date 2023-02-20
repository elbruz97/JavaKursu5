package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Siralama islemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Tersine cevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Max ve Min eleman bulma
        System.out.println("max(sayilar) = " + Collections.max(sayilar));
        System.out.println("min(sayilar) = " + Collections.min(sayilar));

        //Butun elemanlari set etme
        Collections.fill(sayilar, 0); // butun elemanlara 0 atar
        System.out.println("sayilar = " + sayilar);

        //Replace all
        Collections.replaceAll(sayilar, 0, 5); // 0 lari 5 yapar
        System.out.println("sayilar = " + sayilar);

        //Tanimlarken deger atama
        int[] dizi = {2, 3, 4, 5};
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("liste = " + liste);

        ArrayList<String> strListe = new ArrayList<>(Arrays.asList("ali", "mehmet", "burcu", "roman"));
        System.out.println("strListe = " + strListe);

        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2, 2, 3, 4, 5, 6, 7);
        System.out.println("liste2 = " + liste2);

        //Diziyi direk ArrayList e atamak
        Integer[] dizi2 = {2, 3, 4, 5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);


    }
}
