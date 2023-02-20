package Gun32._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        Okul yeniOkul = new Okul("Kabatas Okulu", 3); // kontenjan 3

        do {

            System.out.println("Ogrenci Adi = ");
            String ad = okuInt.nextLine();
            System.out.println("Ogrenci Soyadi = ");
            String soyad = okuInt.nextLine();
            System.out.println("Ogrenci Yasi = ");
            int yas = okuStr.nextInt();

            if (yas < 15){
                Ogrenci ogr = new Ogrenci(ad, soyad, yas);
                yeniOkul.getOgrenciler().add(ogr);
            } else
                System.out.println("Ogrenci yasi okul icin uygun degil");

        }while (yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan());

        System.out.println("Ogrenciler = " + yeniOkul.getOgrenciler());

    }
}
