package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi = 5; // hafizada 1 sayi saklar
        int[] dizi = new int[6]; // hafizada 6 sayi saklar : sabit boyutlu
        int[][] tablo = new int[3][20]; // hafizada 60 sayi saklar, 3x20 seklinde : sabit boyutlu

        // dizi lazim ama boyutu ekledikce artsin, sildikce kisalsin
        ArrayList<Integer> liste = new ArrayList<>(); // boyu degisken
        ArrayList< ArrayList <Integer> > listelerinListesi = new ArrayList<>(); // 2 boyutlu, 2 boyutu da degisken

        /************************************************************************/

        // Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle set ver bana, yani dizi tip ver bana.
        // Java mektubumuza cevap verdi :
        // Sevgili Muhammed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
        // dizilerimiz var dedi.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(32);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi = hs1.add(5);
        boolean tekrarEklendiMi = hs1.add(5);
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);

    }
}
