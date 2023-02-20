package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir sayinin tek sayi olup olmadigini yaziniz.

        Scanner okuInt = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        int sayi = okuInt.nextInt();

        System.out.println("Sayi tek mi? " + (sayi % 2 == 1));

        // 2.Yontem

        boolean tekMi = (sayi % 2 == 1);
        System.out.println("tekMi = " + tekMi);
    }
}
