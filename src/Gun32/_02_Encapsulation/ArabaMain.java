package Gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
// Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

        Araba a1 = new Araba();
        a1.setKapiSayisi(5);
        a1.setModel(2022);
        a1.setRenk("Kirmizi");
        a1.setMotorHacmi(1599);
        System.out.println("a1 = " + a1);

        Araba a2 = new Araba("mavi", 2030, 1600, 4);
        System.out.println("a2 = " + a2);

        int araba1Modeli = a1.getModel();

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.
    }
}
