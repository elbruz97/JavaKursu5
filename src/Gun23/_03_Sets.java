package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        //Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasil yazdiririm?
        for (String eleman : renkler) { // sira garanti degil
            System.out.println("eleman = " + eleman);
        }

        // For each ornek
        int[] dizi = {34, 5, 6, 7, 8, 88, 456, 45, 99};
        for (int sayi : dizi) {
            System.out.println("sayi = " + sayi);
        }

        // set in kendi sırası nasıl ise onun aynısını verir
        Iterator gosterge = renkler.iterator();

        while (gosterge.hasNext()){
            System.out.println("gosterdigi eleman = " + gosterge.next());
            // .Next gostergenin gösterdiği elemanı temsil ediyor
        }


    }
}
