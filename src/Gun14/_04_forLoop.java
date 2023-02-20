package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //Kullanicinin girecegi bir sayiya (dahil) kadar olan sayilarin toplamini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();
        int toplam = 0;

        for (int i = 0; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("toplam = " + toplam);
    }
}
