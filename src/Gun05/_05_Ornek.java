package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Ilk sayi giriniz = ");
        int ilkSayi = oku.nextInt();

        System.out.print("Ikinci Sayi giriniz = ");
        int ikinciSayi = oku.nextInt();

        int toplam = ilkSayi + ikinciSayi;

        System.out.println("Ilk Sayi = " + ilkSayi);
        System.out.println("Ikinci Sayi = " + ikinciSayi);
        System.out.println("Toplam = " + toplam);
    }
}
