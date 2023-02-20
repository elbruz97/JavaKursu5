package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanicidan Adini ve Soyadini alarak ekrana yaziniz.

        Scanner okuyucu = new Scanner(System.in); // okuma islemi yapacak degisken tanimlandi

        System.out.print("Adinizi ve soyadinizi giriniz = ");

        String adSoyad = okuyucu.nextLine(); // okuma islemi bu noktada yapiliyor

        System.out.println("adSoyad = " + adSoyad);
    }
}
