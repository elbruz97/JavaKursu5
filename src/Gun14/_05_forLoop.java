package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayiya (dahil) kadar olan sayilarin carpimini bulunuz.
        // Faktoriley bulma ( 7! = 5040 )

        // 2.bolum: carpimin degeri 100,000 i gecerse islem sonlansin

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        long toplam = 1;
        boolean sinirAsildi = false;

        for (int i = 1; i <= sayi; i++) {
            toplam *= i;

            if (toplam > 100000) {
                sinirAsildi = true;
                System.out.println("100,000 siniri asildi");
                break;
            }
        }

        if (sinirAsildi == false )
            System.out.println("toplam = " + toplam);
    }
}
