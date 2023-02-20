package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // Yazilarin rakamlara, rakamlarin yaziya cevrilmesi

        String ad = "ismet";
        String kelimeSayi = "75"; // string halinde, toplama isleme giremez

        int sayiDeger = Integer.parseInt(kelimeSayi); // sayiya donusturur

        int toplam = sayiDeger + sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam su anda int yani sayi, bunu stringe nasil donustururum
        String strToplam = Integer.toString(toplam); // String e donusturur
        System.out.println("strToplam = " + strToplam);
    }
}
