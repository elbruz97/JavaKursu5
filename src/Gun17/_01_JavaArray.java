package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanli bir dizi tanimlayiniz, 10 a kadar olan sayilardan Random atayarak doldurunuz.
        // Sonrasinda ayri bir dongu ile tek olanlar 1, cift olanlara 0 atayiniz.

        int[] sayilar = new int[50];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("sayilar once = " + sayilar[i]);
        }

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 == 0) {
                sayilar[i] = 0;
            }else
                sayilar[i] = 1;
        }

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("sayilar sonra = " + sayilar[i]);
        }
    }
}
