package Odevler;

import java.util.Arrays;

public class _06_Aralik4 {
    public static void main(String[] args) {


        // Soru 1:
        // String'deki kelime sayısını yazdırınız.

        String bir = "Removes white space from both ends of a string";

        int boslukSayisi = 0;

        for (int i = 0; i < bir.length(); i++) {

            if (bir.charAt(i) == ' ')
                boslukSayisi++;

        }

        System.out.println("Kelime Sayisi = " + (boslukSayisi + 1));


        // Soru 2:
        // Stringi tersten yazdırın ve print edin.

        String iki = "Hello World";
        String ikiTersten = "";

        for (int i = (iki.length() - 1); i >= 0; i--) {
            ikiTersten += iki.charAt(i);
        }

        System.out.println("ikiTersten = " + ikiTersten);


        // Soru 3:
        // Array in elemanlarının toplamını yazdır.

        int[] a = {25, 30, 30, 35, 100};
        int toplam3 = 0;

        for (int i = 0; i < a.length; i++) {
            toplam3 += a[i];
        }

        System.out.println("toplam3 = " + toplam3);


        // Soru 4:
        // Arrayin elemanlarını yazdırın.

        int[] e = {13, 15, 14, 16, 16};

        for (int i = 0; i < e.length; i++) {
            System.out.println((i + 1) + ".eleman = " + e[i]);
        }


        // Soru 5:
        // Array'daki eleman sayısını yazdırınız.

        String[] sehir = {"new jersey", "new york", "boston", "California"};
        int sehirSayisi = 0;

        for (int i = 0; i < sehir.length; i++) {
            sehirSayisi++;
        }

        System.out.println("Sehir Sayisi = " + sehirSayisi);


        // Soru 6:
        // Array'leri tüm elemanları yazdırınız.

        String[] meyve = {"Apple", "Orange", "Babana", "Kiwi"};

        for (int i = 0; i < meyve.length; i++) {
            System.out.println((i + 1) + ".meyve = " + meyve[i]);
        }


        // Soru 7:
        // Array'in ortalamasını alınız.

        int[] notlar = {12, 14, 21, 23, 10, 4};
        int toplamNot = 0;
        int notSayisi = 0;

        for (int i = 0; i < notlar.length; i++) {
            toplamNot += notlar[i];
            notSayisi++;
        }

        int ortalama = toplamNot / notSayisi;
        System.out.println("ortalama = " + ortalama);


        // Soru 8:
        // Eğer sayı çiftse topla, tekse çıkar.

        int[] sekiz = {5, 6, 8, 12, 14, 19};
        int sekizToplam = 0;

        for (int i = 0; i < sekiz.length; i++) {
            if (sekiz[i] % 2 == 0)
                sekizToplam += sekiz[i];
            else
                sekizToplam -= sekiz[i];
        }

        System.out.println("sekizToplam = " + sekizToplam);


        // Soru 9:
        // Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dokuz = {15, 25, 22, 18, 30};
        Arrays.sort(dokuz);
        int uzunluk9 = dokuz.length;
        System.out.println("dokuz = " + Arrays.toString(dokuz));
        System.out.println("en buyuk 2. eleman = " + dokuz[(uzunluk9 - 2)]);


        // Soru 10:
        // En küçük (minimum) sayıyı yazdırınız.

        int[] on = {14, 19, 5, 21};
        Arrays.sort(on);
        System.out.println("on = " + Arrays.toString(on));
        System.out.println("en kucuk eleman = " + on[0]);


        // Soru 11:
        // En büyük değeri yazdırınız.

        int[] onbir = {12, 2, 5, 15, 8};
        Arrays.sort(onbir);
        int uzunluk11 = onbir.length;
        System.out.println("onbir = " + Arrays.toString(onbir));
        System.out.println("en buyuk eleman = " + onbir[(uzunluk9 - 1)]);


        // Soru 12:
        // Apple elemanının bu Array'a ait olup olmadığını kontrol edin.

        String[] oniki = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean appleVarMi = false;

        for (int i = 0; i < oniki.length; i++) {
            if (oniki[i] == "Apple")
                appleVarMi = true;
        }

        System.out.println("Apple Var Mi? = " + appleVarMi);


        // Soru 13:
        // $ işaretlerini kaldırın ve sayıları toplayın.

        String onuc = "$12 $23 $10 $2 $5 $2";

        String yeni = onuc.replaceAll("\\$", "");
        System.out.println("onuc = " + yeni);

        int toplam13 = 0;

    }
}
