package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayidan buyuk olanini yazdiriniz. Esit ise esit yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("ilk sayiyi giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("ikinci sayiyi giriniz = ");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("buyuk sayi ilk sayi = " + sayi1);
        }

        if (sayi2 > sayi1)
            System.out.println("buyuk sayi ikici sayi = " + sayi2);

        if (sayi2 == sayi1)
            System.out.println("sayilar esit");
    }
}
