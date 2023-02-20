package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Daha once cozdugumuz hesap makinesi sorusunu switch ile cozunuz.

        Scanner oku = new Scanner(System.in);

        System.out.print("ilk sayi = ");
        int sayi1 = oku.nextInt();

        System.out.print("ikinci sayi = ");
        int sayi2 = oku.nextInt();

        Scanner okuStr = new Scanner(System.in);

        System.out.println("Toplama icin T giriniz");
        System.out.println("Cikartma icin C giriniz");
        System.out.println("Carpma icin P giriniz");
        System.out.println("Bolme icin B giriniz");

        String islem = okuStr.next();

        switch (islem.toUpperCase()) {
            case "T": System.out.println("Toplam = " + (sayi1 + sayi2)); break;
            case "C": System.out.println("Fark = " + Math.abs((sayi1 - sayi2))); break;
            case "P": System.out.println("Carpim = " + (sayi1 * sayi2)); break;
            case "B": System.out.println("Bolum = " + ((double)sayi1 / sayi2)); break;
            default: System.out.println("Hatali secim");
        }
    }
}
