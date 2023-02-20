package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1 = new Kisi();
//        kisi1.ad="ismet";
//        kisi1.soyad="temur";
        kisi1.setYas(-25);
        kisi1.setAd("ismet");
        kisi1.setSoyad("temur");

        System.out.println("kisi1.getAd() = " + kisi1.getAd());

        System.out.println("kisi1 = " + kisi1);

        // degiskene direk erisimi kapatip
        //bir metod ile korumali veri gonderme ve alma
        // islemine Encapsulation denir.
    }
}
