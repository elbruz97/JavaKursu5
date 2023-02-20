package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisin
        // Bilirse tebrikler yaziniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Uretilecek sayi limiti giriniz = ");
        int limit = oku.nextInt();

        int randTamSayi = (int) (Math.random() * limit);

        System.out.print("Tahmin giriniz = ");
        int tahmin = oku.nextInt();

        if (randTamSayi == tahmin) {
            System.out.println("Bildiniz tebrikler!");
            System.out.println("randTamSayi = " + randTamSayi);
            System.out.println("tahmin = " + tahmin);
        } else {
            System.out.println("Tekrar deneyiniz");
            System.out.println("randTamSayi = " + randTamSayi);
            System.out.println("tahmin = " + tahmin);
        }
    }
}
