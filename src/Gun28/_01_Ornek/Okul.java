package Gun28._01_Ornek;

public class Okul {
    public static void main(String[] args) {

        // 1.yol
        Ogrenci ogr1 = new Ogrenci(); //nesne olusma ani

        ogr1.id = 1; // ozellikelrinin degerleini veriyorum
        ogr1.ad = "Ismet";
        ogr1.soyad = "Temur";
        ogr1.sinifi = 5;
        
        // 2.yol
        Ogrenci ogr2 = new Ogrenci(2, "mehmet", "yilmaz", 5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        // sinifi olmadan
        Ogrenci ogr3 = new Ogrenci(3, "Ayse", "Bayrak");

    }
}
