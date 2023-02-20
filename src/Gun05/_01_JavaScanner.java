package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        int sayi = 0;

        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        sayi = okuyucu.nextInt(); // rakam girildiginde degeri alip sayi ya atiyor

        System.out.println("sayi = " + sayi);
    }
}
