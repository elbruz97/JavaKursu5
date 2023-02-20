package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta yazdiriniz. bosluklari yazmasin

        Scanner oku = new Scanner(System.in);

        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        int uzunluk = cumle.length();

        for (int i=0; i<uzunluk; i++) {

            if (cumle.charAt(i) == ' ')
                continue;

            System.out.println(cumle.charAt(i));
        }

    }
}
