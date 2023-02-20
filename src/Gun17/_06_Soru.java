package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random(10) olarak doldurduktan sonra
        // kullanicinin girecegi bir rakami aratiniz.
        // bu rakam var ise indexini yazdiriniz.

        int[] sayilar = new int[10];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 11);
        }

        Scanner oku = new Scanner(System.in);
        System.out.print("Aranan sayi yi giriniz (0-10) = ");
        int sayi = oku.nextInt();
        boolean bulunduMu = false;

        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] == sayi) {
                System.out.println("aranan rakam " + i + ". index de");
                bulunduMu = true;
                // break; // ilk sayiyi buldugu an ciksin diye
            }

        }

        if (!bulunduMu) // bulunduMu == false
            System.out.println("Aradiginiz sayi bulunamadi");
        }
    }
