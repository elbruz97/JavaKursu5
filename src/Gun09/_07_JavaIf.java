package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cumledeki kucuk veya buyuk a harfinin olup olmadigini yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("cumle giriniz = ");
        String cumle = oku.nextLine();

        cumle = cumle.toLowerCase();

        if (cumle.contains("a")) {
            System.out.println("EVET");
        }

        if (!cumle.contains("a")) {
            System.out.println("HAYIR");
        }
    }
}
