package Gun17;

import java.util.Arrays;

public class _05_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler = {"ahmet", "zeynep", "Roman", "yasin", "cihan"};

        // diziyi string olarak direk yazdirir
        System.out.println("isimler = " + Arrays.toString(isimler));

        // dizi siralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        // Diziler esit mi?
        int[] a={1, 8, 3, 54};
        int[] b={1, 8, 3, 54};
        int[] c={1, 8, 2, 54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); //false

        Arrays.sort(c); // sayi bazli dizi siralamasi
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c)); // [1, 2, 8, 54]


        // contains gibi calisir, var ise pozitif bir deger verir, yok ise negatif
        System.out.println("Arrays.binarySearch(b, 3) = " + Arrays.binarySearch(b, 3)); // -2
        Arrays.sort(b); // ancak siralanmis dizilerde dogru sonuc verir
        System.out.println("Arrays.binarySearch(b, 3) = " + Arrays.binarySearch(b, 3)); // 1
    }
}
