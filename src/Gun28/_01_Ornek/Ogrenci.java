package Gun28._01_Ornek;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci() { // yapici metodlar
        System.out.println("nesne olusturuldu");
    }

    public Ogrenci(int id, String ad, String soyad, int sinifi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinifi = sinifi;
    }

    public Ogrenci(int id, String ad, String soyad) {

        this(id, ad, soyad, 0); // this ogrenci metodunun kendisi

//        this.id = id;
//        this.ad = ad;
//        this.soyad = soyad;
//        this.sinifi = 0;
    }

}
