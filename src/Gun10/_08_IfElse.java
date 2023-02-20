package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarinda bir boslukla girilen 3 sayinin toplaminin tek mi cift mi oldugunu bulunuz

        Scanner oku = new Scanner(System.in);

        System.out.print("1 bosluk birakarak uc sayi giriniz = ");
        String sayilar = oku.nextLine();

        int ilkBoslukIndex = sayilar.indexOf(" ");
        int ikinciBoslukIndex = sayilar.indexOf(" ", ilkBoslukIndex + 1);


        int sayi1 = Integer.parseInt(sayilar.substring(0, ilkBoslukIndex));
        int sayi2 = Integer.parseInt(sayilar.substring(ilkBoslukIndex + 1, ikinciBoslukIndex));
        int sayi3 = Integer.parseInt(sayilar.substring(ikinciBoslukIndex + 1));

        int sayiarToplam = sayi1 + sayi2 + sayi3;
            System.out.println("sayiarToplam = " + sayiarToplam);

        if (sayiarToplam % 2 == 0)
            System.out.println("Toplam Cift");
        else
            System.out.println("Toplam Tek");
    }
}
