package Gun28._04_Soru;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.

    public static void main(String[] args) {

        Banka b1 = new Banka();
        Banka b2 = new Banka("Ziraat", 235, 1945);
        Banka b3 = new Banka("Garanti", 343);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}
