package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {

        int s1 = 4;
        int s2 = 12;
        int s3 = 34;
        int s4 = 45;

        int sonuc1 = toplamBul("ismet", s1, s2);
        int sonuc2 = toplamBul("mehmet", s1, s2, s3);
        int sonuc3 = toplamBul("elbruz", s1, s2, s3, s4);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

    }

    //gelen kac sayi olursa olsun hepsini al dizi seklinde
    // bir methodda sadece 1 tane olabilir ve sonda olmasi lazim
    public static int toplamBul(String isim, int... sayilar) { // kac sayi gelirse gelsin onlari dizi seklinde aliyor
        int toplam = 0;

        System.out.println("isim = " + isim);
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }

        return toplam;
    }
}
