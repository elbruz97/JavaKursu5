package Odevler.Aralik11_Metodlar;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // 2.Soru
        // "OrtaKelime" isminden bir method oluşturun. Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //
        //Örnek1: Ben Java'yı seviyorum.
        //print : Java'yı
        //
        //Örnek2:Java'yı kolayca öğreniyorum.
        //print: kolayca

        Scanner oku =new Scanner(System.in);
        System.out.print("Cümle giriniz : ");
        String cumle = oku.nextLine();

        System.out.println(ortaKelime(cumle));
    }

    public static String ortaKelime(String cumle) {

        int ilkBosluk = cumle.indexOf(" ");
        int sonBosluk = cumle.lastIndexOf(" ");

        return cumle.substring(ilkBosluk + 1, sonBosluk);
    }
}
