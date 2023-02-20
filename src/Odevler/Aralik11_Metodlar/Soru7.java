package Odevler.Aralik11_Metodlar;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        // Soru 7
        // powerOfThree isminde bir method oluşturun.Parametre olarak int. Return tipi boolean
        //
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //
        //Örnek:
        //Girdi: 27
        //Çıktı: true
        //
        //Açıklama: 3*3*3 =27
        //Sonuç= true

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int sayi = oku.nextInt();

        System.out.println(powerOfThree(sayi));
    }

    public static boolean powerOfThree(int sayi) {
        for (int i = 3; i <= sayi; i *= 3) {
            if (i == sayi)
                return true;
        }
        return false;
    }

}
