package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        // Kullanicidan sayi alarak tek mi cift mi yazdiralim
        tekMiCiftMiOku();

    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi %2 != 0)
            System.out.println("tek");
        else
            System.out.println("cift");
    }

    public static void tekMiCiftMiOku() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Rakam Giriniz = ");
        int sayi = oku.nextInt();

        tekMiCiftMi(sayi);
    }
}
