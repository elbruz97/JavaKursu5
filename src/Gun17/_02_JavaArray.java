package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz. for dongusu ile
        // Bu gun hava cok guzel -> 5

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {

            if(cumle.charAt(i) == ' ')
                boslukSayisi++;
        }

        System.out.println("kelime sayisi = " + (boslukSayisi + 1));
    }
}
