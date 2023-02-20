package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Ogrenci4> snf = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Ogrenci4 ogr = new Ogrenci4();
            System.out.print("Tam Adi = ");
            ogr.tamAdi = okuStr.nextLine();

            System.out.print("Okul No = ");
            ogr.okulNo = okuInt.nextInt();

            System.out.print("Not = ");
            ogr.notu = okuInt.nextInt();

            snf.add(ogr);
        }

        bilgileriYazdir(snf);
        ortalamaYazdir(snf);
    }

    public static void bilgileriYazdir(ArrayList<Ogrenci4> snf){
        for (Ogrenci4 ogr : snf){
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr.notu = " + ogr.notu);
        }
    }

    public static void ortalamaYazdir(ArrayList<Ogrenci4> snf){
        int toplam = 0;

        for (Ogrenci4 ogr : snf)
            toplam += ogr.notu;

        System.out.println("ortalama = " + (toplam / snf.size()));
    }
}
