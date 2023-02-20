package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu aliniz, devam etmek istiyor musunuz (E/H) seklinde sorunuz
        // ve ortalamayi gecen ogrenci sayisini bulunuz.

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();
        int toplam = 0;
        String devamMi;

        do {
            // notu girecek
            System.out.print("not giriniz = ");
            int not = okuInt.nextInt();

            //notlari arrayliste ekle
            notlar.add(not);

            // notlari topla
            toplam += not;

            // devam etmek istiyor musun (E/H)
            System.out.print("Devam etmek istiyor musunuz? (E/H) = ");
            devamMi = okuStr.next();

        } while(devamMi.equalsIgnoreCase("E"));

        // ortalamayi bul
        int ort = toplam / notlar.size();
        System.out.println("ortalama = " + ort);

        // gecen sayisini bul
        int gecenSayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort)
                gecenSayisi++;
        }

        System.out.println("Gecen Sayisi = " + gecenSayisi);
    }
}
