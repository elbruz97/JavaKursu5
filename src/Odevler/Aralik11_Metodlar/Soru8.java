package Odevler.Aralik11_Metodlar;

import java.util.Arrays;

public class Soru8 {
    public static void main(String[] args) {
        // Soru 8
        // append adında bir method oluşturun. Parametre olarak iki int array  oluşturun
        //
        //ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        //
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //
        //Bunu döndürmelidir: {2, 4, 6, 1, 2, 3, 4, 5}

        int[] dizi1 = {2, 4, 6};
        int[] dizi2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(append(dizi1, dizi2)));
    }

    public static int[] append(int[] dizi1, int[] dizi2) {

        int[] diziBirlesik = new int[dizi1.length + dizi2.length];

        for (int i = 0; i < dizi1.length; i++) {
            diziBirlesik[i] = dizi1[i];
        }

        int index = 0;

        for (int i = dizi1.length; i < diziBirlesik.length; i++) {
            diziBirlesik[i] = dizi2[index];
            index++;
        }

        return diziBirlesik;

    }
}
