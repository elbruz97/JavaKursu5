package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Ogrenci_Soru2> snf = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci_Soru2 ogr = new Ogrenci_Soru2();
            System.out.print("Ogrenci adi giriniz = ");
            ogr.adi = okuStr.nextLine();

            System.out.print("Ogrenci soyadi giriniz = ");
            ogr.soyadi = okuStr.nextLine();

            System.out.print("Ogrenci sinifi giriniz = ");
            ogr.sinifi = okuInt.nextInt();

            System.out.print("Ogrenci adresi giriniz = ");
            ogr.adres = okuStr.nextLine();
            
            snf.add(ogr);
        }
        
        for (Ogrenci_Soru2 ogr : snf){
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);
        }

    }
}

class Ogrenci_Soru2 {
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}
