package Gun25;

import Gun25._03_Soru.Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //Ödev : Bir bordro programı yapılmak isteniyor.
        // Her calisanin bordroNo(int), tamAdi(String) ve maasi(int) vardır.
        // Kullanıcıdan 20 calisan için bu bilgileri alınız.
        // Bir metodda bütün calisanlar yazdırınız.
        // Bir metodda maas ortalamasını yazdırınız.
        // Bir metodda en fazla ve en az maas alanların simlerini yazdırınız.

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Odev_sinif> calisanlar = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Odev_sinif calisan = new Odev_sinif();

            System.out.print("Bordro no giriniz = ");
            calisan.bordroNo = okuInt.nextInt();

            System.out.print("Tam adi giriniz = ");
            calisan.tamAdi = okuStr.nextLine();

            System.out.print("Maasi giriniz = ");
            calisan.maasi = okuInt.nextInt();

            calisanlar.add(calisan);
        }

        calisanlarYazdir(calisanlar);
        maasOrt(calisanlar);
        enfazlaVeEnazmaasAlanlar(calisanlar);
    }

    public static void calisanlarYazdir(ArrayList<Odev_sinif> calisanlar){
        for (Odev_sinif kisi : calisanlar){
            System.out.println("BordroNo = " + kisi.bordroNo);
            System.out.println("TamAdi = " + kisi.tamAdi);
            System.out.println("Maasi = " + kisi.maasi);
        }
    }

    public static void maasOrt(ArrayList<Odev_sinif> calisanlar){
        int toplam = 0;
        int count = 0;
        for (Odev_sinif kisi : calisanlar){
            toplam += kisi.maasi;
            count++;
        }

        System.out.println("Maas ortalamasi = " + (toplam / count));
    }

    public static void enfazlaVeEnazmaasAlanlar(ArrayList<Odev_sinif> calisanlar){
        
    }
}
