package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanicindan adini ve soyadini ayri ayri okuyarak alip birlikte ekrana yaziniz.

        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Adinizi giriniz = ");
        String ad = okuyucu.next(); // okuma islemi bu noktada yapiliyor

        System.out.print("Soyadinizi giriniz = ");
        String soyad = okuyucu.next();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad soyad = " + ad + " " + soyad);
    }
}
