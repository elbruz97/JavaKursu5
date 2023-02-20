package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Kullanicidan 5 sayi isteyiniz. Bu sayilardan 6 ile 10 arasindakiler haric, digerleri toplansin

        Scanner oku = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print((i + 1) + ".Sayi giriniz = ");
            int sayi = oku.nextInt();

            if (sayi >= 6 && sayi <= 10) {
                continue; // calistigi anda kendinden sonra gelen komutlari pas gecirir
            }

            toplam += sayi;
        }

        System.out.println("toplam = " + toplam);
    }
}
