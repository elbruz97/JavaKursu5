package Gun19;

import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {
        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.

        diziDoldurRandom(20);

        System.out.println();

        int[] dizi = new int[20];
        diziDoldurYazdir(dizi);
    }

    public static void diziDoldurRandom(int uzunluk) {
        int[] dizi = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
                dizi[i] = (int) (Math.random() * 100);
                System.out.print(dizi[i] + "\t");
        }
    }

    public static void diziDoldurYazdir(int[] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 100);
        }

        System.out.println("Sayilar = " + Arrays.toString(sayilar));
    }

}

