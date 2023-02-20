package Projeler.Proje1;

import java.util.Scanner;

public class _01_Proje {
    public static void main(String[] args) {
        // Scanner class tanimlayin...
        Scanner oku = new Scanner(System.in);
        Scanner okuChar = new Scanner(System.in);

        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        System.out.print("Adinizi giriniz : ");
        String adi = oku.nextLine();

        adi = adi.substring(0, 1).toUpperCase() + adi.substring(1);

        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        System.out.print(adi + " hosgeldin, soyismini de girer misin? : ");
        String soyadi = oku.nextLine();
        soyadi = soyadi.substring(0, 1).toUpperCase() + soyadi.substring(1);

        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        System.out.println(adi + " " + soyadi);

        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...
        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim

        String secim = "";

        do {
            System.out.println(adi + " " + soyadi + " isminiz dogru ise devam etmek icin Y tusa basiniz...");
            secim = oku.nextLine();

            if (secim.equalsIgnoreCase("Y"))
                System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");
            else
                System.out.println("Tercihiniz dogru yapmadiniz... lutfen tekrar deneyin...");

        }while(!secim.equalsIgnoreCase("Y"));


        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"
        System.out.println(" Lutfen kullanici adnizi belirleyin...:");
        String kullaniciAdi = oku.nextLine();

        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"
        System.out.println(" Lutfen sifrenizi belirleyiniz...:");
        String sifre = oku.nextLine();

        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"
        System.out.println(" Sifrenizi tekrar giriniz...:");
        String sifreTekrar = oku.nextLine();

        // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim
        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...

        if (sifre.equals(sifreTekrar))
            System.out.println("Tebrikler... " + kullaniciAdi + " kullanici adiyla sisteme kayit oldunuz...");
        else
            System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...");

    }
}
