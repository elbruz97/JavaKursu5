package Gun16;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi = new int[5]; // 5 elemanli dizi
        int [] dizi2 = {5, 6, 34, 77, 66}; // 5 elemanli dizi, hem tanimladim hemde deger verdim

        String[] kelimeler = new String[5]; // 5 tane kelime/cumle saklayabilen dizi
        boolean[] dizi3 = new boolean[5]; // 5 tane boolean saklayabilen dizi
        double [] oranlar = new double[5]; // 5 tane double saklayabilen dizi

        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("dizi2 = " + dizi2[i]);
        }

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = " + oranlar[i]);
        }

        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi3 = " + dizi3[i]);
        }
    }
}
