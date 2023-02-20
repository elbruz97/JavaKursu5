package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Rakam Giriniz = ");
            dizi[i] = oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi)); // yazdirmak icin
        // System.out.println(dizi.length); // test icin, 5 veriyor

        enKucuk(dizi);
        enBuyuk(dizi);
        ortalama(dizi);

    }

    public static void enKucuk(int[] dizi) {
        // Arrays.sort(dizi);
        //System.out.println("en kucuk = " + dizi[0]);

        int enk = dizi[0];

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] < enk)
                enk = dizi[i];
        }

        System.out.println("en kucuk sayi = " + enk);
    }

    public static void enBuyuk(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("en buyuk sayi = " + dizi[dizi.length -1]);
    }

    public static void ortalama(int[] dizi) {
        int toplam = 0;
        int ort;

        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        ort = toplam / (dizi.length);
        System.out.println("ortalama = " + ort);

    }
}
