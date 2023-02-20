package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yontemi ile girilen 3 sayidan buyuk olanini bulunuz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Ilk rakami giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("Ikinci rakami giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.print("Ucuncu rakami giriniz = ");
        int sayi3 = oku.nextInt();

        System.out.println("En buyuk rakam = " + Math.max(sayi1, Math.max(sayi2, sayi3))); // 2 den fazla arguman almiyor

        // 2. Yol
        int enb = Math.max(sayi1, Math.max(sayi2, sayi3));
        System.out.println("enb = " + enb);
    }
}
