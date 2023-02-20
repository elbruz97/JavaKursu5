package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarinda bir boslukla girilen 2 sayinin birbirine esit olup olmadigini bulunuz

        Scanner oku = new Scanner(System.in);

        System.out.print("1 bosluk birakarak iki sayi giriniz = ");
        String sayi = oku.nextLine();

        int bosluk = sayi.indexOf(" ");

        String ilkSayi = sayi.substring(0, bosluk);
        String ikinciSayi = sayi.substring(bosluk + 1);

        int ilkSayiDeger = Integer.parseInt(ilkSayi);
        int ikinciSayiDeger = Integer.parseInt(ikinciSayi);

        if (ilkSayiDeger == ikinciSayiDeger)
            System.out.println("Esit");
        else
            System.out.println("Esit DEGIL");

    }
}
